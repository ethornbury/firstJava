/*
*	File:		Game.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:		20/11/14	
*
*	
*	play a game of Rock-Paper-Scissors
*=====================================
*/

import java.util.Scanner;
public class Game{
	
	// declare vars
	protected int gameNum;
	//protected  int uGo;
	
        //declare and create objects
        Scanner kb = new Scanner(System.in);
        Round myRound = new Round();
        
        // constructor
        public Game(){
           int ul = 0;
           int uw = 0;
           int cw = 0;
           int cl = 0;
        }   
        
        // process
        public void playGames(){
            //loop to play games
            System.out.println("So you don't have to type long words, we will use numbers!");           
            //System.out.println("Rock - paper - scissors!");
            System.out.println("1 = rock");
            System.out.println("2 = paper");
            System.out.println("3 = scissors");
            
            do{
            myRound.playRounds();
            
            //
            
            gameNum--;
            }while (gameNum>0);
        }        
                //display stats
        public void displayDetails(){
            //display
            System.out.println("Rock - paper - scissors! display stats in game.java");
//            for(numrows = gameNum){
//                for(loop for cols){
//   
//            
//            
//            
//                }
//            
//            
//            
//            }
        };
}