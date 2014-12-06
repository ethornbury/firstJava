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

    // declare and create arrays
    //private int[][] uGoes = new int[50][3]; //user stats [rounds][result]
    //private int[][] cGoes = new int[50][3]; //computer stats [rounds][result]
    //private String[][] shapeStats = new String[50][2]; //[rounds][user shape,computer shape]
	//private int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]
	//private int[][] gameStat = new int[gameNum-1][4]; //[number of game][uw,ul,cw,cl]

    //declare and create objects
    Scanner kb = new Scanner(System.in);
    RandomGo myRandomGo = new RandomGo();
	//Reset myReset = new Reset();

    // constructor
    public GameGo(){
        uLife = 3;

    }//end of Game() constructor


    // process
    public void PlayGames(){
		// declare and create arrays in method so no reset needed
		//private int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]
		//private int[][] cGoes = new int[50][3]; //computer stats [rounds][result]
    	private String[][] shapeStats = new String[50][2]; //[rounds][user shape,computer shape]

		//myReset.ResetAll();
        System.out.println("Enter the amount of games you would like to play");
        gameNum = kb.nextInt();


        System.out.println("gameNum = "+gameNum);
        while (gameNum != 0){
			// declare and create arrays in method so no reset needed
			private int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]

            System.out.println("So you don't have to type long words, we will use numbers!");
            System.out.println("rock = 1\npaper = 2\nscissors = 3\n");

        //process for playing rounds

	// loop for rounds - execute while uLife more than 0.
        for (int i=0; uLife > 0; i++){
            System.out.println("Round number " + (i+1));
            System.out.println("And your guess is: (1/2/3)");
            uGo = kb.nextInt();
            myRandomGo.CreateGo();
            cGo = myRandomGo.getCGo();
            System.out.println("uGo "+uGo); //testing
            System.out.println("cGo  "+cGo); //testing
            shapeStat[i][0] = uGo;
            shapeStat[i][1] = cGo;

            // compare
            if(uGo == cGo){

                System.out.println("Hey Draw!!");

                // draw types
                switch (cGo){
                    case 1:
                        System.out.println("We both choose Rock");
						//result draw
						roundStat[i][i]= "Draw";
                    	roundStat[i][i]= "Draw";
                        break;

                    case 2:
                        System.out.println("We both choose Paper");
					    //result draw
						uGoes[i][i]= "Draw";
                    	cGoes[i][i]= "Draw";
                		break;
                    case 3:
                        System.out.println("We both choose Scissors");
						//result draw
						uGoes[i][i]= "Draw";
                    	cGoes[i][i]= "Draw";
                        break;

                    default:
                        System.out.println("Oops somethings wrong!");
                        break;

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
        System.out.println("Ok end of game, lets look at stats");
        //break;
        //public void DisplayDetails(){
             //display stats
         //   System.out.println("Rock - paper - scissors! display stats in game.java");
//            for(numrows = gameNum){
//                for(loop for cols){
        //}//end of DisplayDetails()
    } //end of PlayGames()
}//end of class