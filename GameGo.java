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
    private int r;
    private int uGo;
    private int cGo;
    private int uLife; //user life
    private String uGoShape;
    private String cGoShape; 

    // declare and create arrays
    //private int[][] uGoes = new int[50][3]; //user stats [rounds][result]
    //private int[][] cGoes = new int[50][3]; //computer stats [rounds][result]
    //private String[][] shapeStats = new String[50][2]; //[rounds][user shape,computer shape]
	//private int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl

    //declare and create objects
    Scanner kb = new Scanner(System.in);
    RandomGo myRandomGo = new RandomGo();
	//Reset myReset = new Reset();

    // constructor
    public GameGo(){
        uLife = 3;
        r = 0;
        
    }//end of Game() constructor


    // process
    public void PlayGames(){
        System.out.println("Enter the amount of games you would like to play");
        gameNum = kb.nextInt();
        
	// declare and create arrays in method so no reset needed
	String[][] shapeStat = new String[50][2]; //[rounds][user shape,computer shape]    
        int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]
        int[] gameStat = new int[5]; //[number of game,uw,ul,cw,cl]
        
        System.out.println("gameNum = "+gameNum); //testing
        while (gameNum != 0){
			// declare and create arrays in method so no reset needed
			//int[][] roundStat = new int[100][5]; //[possible rounds][uw,ul,ud,cw,cd,cl]

            System.out.println("So you don't have to type long words, we will use numbers!");
            System.out.println("rock = 1\npaper = 2\nscissors = 3");

	// loop for rounds - execute while uLife more than 0.
        for ( r=0; uLife > 0; r++){
            System.out.println("\nRound number " + (r+1));
            System.out.println("Your number of lives is " + uLife);
            System.out.println("And your guess is: (1/2/3)");
            uGo = kb.nextInt();
    
            myRandomGo.CreateGo();
            cGo = myRandomGo.getCGo();

            // setter, to process to shape
            myRandomGo.setUGo(uGo);
            myRandomGo.setCGo(cGo);
            // process
            myRandomGo.intShape();
            // getter
            uGoShape = myRandomGo.getShapeU();
            cGoShape = myRandomGo.getShapeC();
            
            // System.out.println(cGo + " cGo uGo "+uGo); //testing           
            //System.out.println(cGoShape  +" cGoShape uGoShape "+ uGoShape); //testing
            // add to array
            shapeStat[r][0] = uGoShape;
            shapeStat[r][1] = cGoShape;

            // compare
            if(uGo == cGo){
                System.out.println("Hey Draw!!");

                // draw types
                switch (cGo){
                    case 1:
                        System.out.println("We both choose Rock");
						roundStat[r][2]= 1;//1 draw for user
                    	roundStat[r][5]= 1;//1 draw for computer
                        break;

                    case 2:
                        System.out.println("We both choose Paper");
						roundStat[r][2]= 1;//1 draw for user
                    	roundStat[r][5]= 1;//1 draw for computer
                		break;
                    case 3:
                        System.out.println("We both choose Scissors");
						roundStat[r][2]= 1;//1 draw for user
                    	roundStat[r][5]= 1;//1 draw for computer
                        break;

                    default:
                        System.out.println("Oops somethings wrong!");
                        break;

                    } //end of switch 
                
                }else if(uGo ==3 && cGo ==2){
			System.out.println("Hey you win!!"); // user wins
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Paper");
                        roundStat[r][0]= 1;//1 win for user                       
                        roundStat[r][4]= 1;//1 lose for computer                   
    
		}else if(uGo ==3 && cGo ==1){
			System.out.println("Ha I win!!"); // computer wins
			uLife--;
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Rock");
                        roundStat[r][1]= 1;//lose for user
                        roundStat[r][3]= 1;//win for computer

		}else if(uGo ==2 && cGo ==3){
			System.out.println("Loser! I win!"); // computer win
                        System.out.println("You choose Paper");
                        System.out.println("I choose Scissors");
			uLife--;
                        roundStat[r][1]= 1;//lose for user
                        roundStat[r][3]= 1;//win for computer

		}else if(uGo ==2 && cGo ==1){
			System.out.println("You win!!"); // user wins
                        System.out.println("You choose Paper");
                        System.out.println("I choose Rock");
			roundStat[r][0]= 1;//1 win for user                       
                        roundStat[r][4]= 1;//1 lose for computer

		}else if(uGo ==1 && cGo ==2){
			System.out.println("I'm the winner!!"); // computer wins
                        System.out.println("You choose Rock");
                        System.out.println("I choose Paper");
			uLife--;
                        roundStat[r][1]= 1;//lose for user
                        roundStat[r][3]= 1;//win for computer

		}else if(uGo ==1 && cGo ==3){
			System.out.println("Rats, you win!!"); // user wins
                        System.out.println("You choose Rock");
                        System.out.println("I choose Scissors");
                        roundStat[r][0]= 1;//1 win for user                       
                        roundStat[r][4]= 1;//1 lose for computer

		}else {
			System.out.println("That's not going to get you anywhere! Quit messing and put in 1/2/3: ");
			r--; //do not increment i as not a valid turn, still the same round.
			System.out.println("check round counter " +r);

		} //end if loop
  
        }//end for loop
                System.out.println("Round info:");
                // display round stats
                for (int d = 0; d < r; d++ ){
                    
                    for(int g = 0; g<6; g++){
                    
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                    }
                    
                }
        gameNum--; //-1 game
        } //end of while(gameNum!=0)
        System.out.println("Ok end of game, lets look at the Game stats:"); 
             //gameStat = new int[5]; //[number of games,uw,ul,cw,cl]
             
         for(int g = 0; g<gameNum; g++ ){
            System.out.println("The number of games played was "+ gameStat[0]);
            System.out.println("You won " +gameStat[1]+" times.");
            System.out.println("You lost " +gameStat[2]+" times.");
            System.out.println("I won " +gameStat[3]+" times.");
            System.out.println("I lost " +gameStat[4]+" times.");
            System.out.println("Not bad!!");
        } //end of PlayGames()
    }    
}//end of class