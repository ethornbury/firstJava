/*
*	File:		Game.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:		20/11/14	
*
*	
*	instantiable class to play a game of Rock-Paper-Scissors
*=====================================
*/

import java.util.Scanner;
public class GameGo{
	
    // declare vars
    private int gameNum;
    private int uGo;
    private int cGo;
    private int uLife; //user life
    private int uRound;     
    private int cRound;
    private int roundNum;
    
    // declare and create arrays
    private String[][] uGoes = new String[50][50];; //user stats (a,b = rounds,result)
    private String[][] cGoes = new String[50][50]; //computer stats (a,b = rounds,result)
    private String[][] roundStats = new String[50][50];
        
    //declare and create objects
    Scanner kb = new Scanner(System.in);
    //Round myRound = new Round();
    RandomGo myRandomGo = new RandomGo();
    
    
    // constructor
    public Game(){
        uLife = 3;
        int ul = 0;
        int uw = 0;
        int cw = 0;
        int cl = 0;
    }//end of Game()   
     
        
    // process
    public void PlayGames(){
        System.out.println("Enter the amount of games you would like to play"); 
        gameNum = kb.nextInt(); 
        System.out.println("gameNum = "+gameNum);
        while (gameNum != 0){
            
            System.out.println("So you don't have to type long words, we will use numbers!");
            System.out.println("rock = 1\npaper = 2\nscissors = 3\n");
            
        //process for playing rounds
	
	// loop for rounds - execute while uLife more than 0.
        for (int i=1; uLife > 0; i++){
            System.out.println("Round number " + i);
            System.out.println("And your guess is: (1/2/3)");
            uGo = kb.nextInt();
            myRandomGo.CreateGo();
            cGo = myRandomGo.getCGo();
            System.out.println("uGo "+uGo); //testing
            System.out.println("cGo  "+cGo); //testing 
            
            // compare 
            if(uGo == cGo){
                System.out.println("Random go in if statement  " + cGo);//testing
                uRound++; cRound++;
                System.out.println("Hey Draw!!");
                        
                // draw types                      
                switch (cGo){
                    case 1:
                        System.out.println("We both choose Rock");
                        break;

                    case 2:
                        System.out.println("We both choose Paper");
                        break;
                    case 3:
                        System.out.println("We both choose Scissors");
                        break;
                    default:
                        System.out.println("Oops somethings wrong!");
                        break;
                                                            
                    //result draw
                    uGoes[i][i]= "Draw";
                    cGoes[i][i]= "Draw";
                    }        
                }else if(uGo ==3 && cGo ==2){ 
			System.out.println("Hey you win!!");
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Paper");
			// user wins
                        uGoes[i][i]= "Won";
                        uRound++;
                        cGoes[i][i]= "Lost";
                        
                        //System.out.println("Random go in else if statement  " + cGo); //testing
		}else if(uGo ==3 && cGo ==1){
			System.out.println("Ha I win!!");
			uLife--;
			// computer wins
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Rock");
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
		}else if(uGo ==2 && cGo ==3){
			System.out.println("Loser! I win!");
			uLife--;
                        System.out.println("You choose Paper");
                        System.out.println("I choose Scissors");
			// computer win
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
		}else if(uGo ==2 && cGo ==1){
			System.out.println("You win!!");
                        System.out.println("You choose Paper");
                        System.out.println("I choose Rock");
			// user wins
			uGoes[i][i]= "Won";
                        cGoes[i][i]= "Lost";
                        
		}else if(uGo ==1 && cGo ==2){
			System.out.println("I'm the winner!!");
			uLife--;
                        System.out.println("You choose Rock");
                        System.out.println("I choose Paper");
			// computer wins
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
		}else if(uGo ==1 && cGo ==3){
			System.out.println("Rats, you win!!");
                        System.out.println("You choose Rock");
                        System.out.println("I choose Scissors");
			// user wins
                        uGoes[i][i]= "Won";
                        cGoes[i][i]= "Lost";                     
			
		}else {
			System.out.println("That's not going to get you anywhere! Quit messing and put in 1/2/3: ");
			//i--; //do not increment i as not a valid turn, still the same round.
			System.out.println("check i counter " +i);
			//end of if-else 
	
		} //end if loop
                        
			// display details
        }//end for loop  
        
        
        gameNum--; //-1 game
        } //end of while(gameNum!=0)
        
        //public void DisplayDetails(){
             //display stats
         //   System.out.println("Rock - paper - scissors! display stats in game.java");
//            for(numrows = gameNum){
//                for(loop for cols){
        //}//end of DisplayDetails()
    } //end of PlayGames()
}//end of class