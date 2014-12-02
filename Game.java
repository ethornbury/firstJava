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
public class Game{
	
	// declare vars
	protected int gameNum;
	protected  int uGo;
	
        //declare and create objects
        Scanner kb = new Scanner(System.in);
        Round myRound = new Round();
        
        // constructor
        public Game(){
           int ul = 0;
           int uw = 0;
           int cw = 0;
           int cl = 0;
        }//end of Game()   
        
        // process
        public void PlayGames(){
            System.out.println("So you don't have to type long words, we will use numbers!");
            System.out.println("1 = rock");
            System.out.println("2 = paper");
            System.out.println("3 = scissors");
            
            //play round
            do{
                myRound.PlayRounds();
            
                //
            
                gameNum--;
            }while (gameNum>0);
        
        }// end of playGames()
              
        public void DisplayDetails(){
             //display stats
            System.out.println("Rock - paper - scissors! display stats in game.java");
//            for(numrows = gameNum){
//                for(loop for cols){
        }//end of DisplayDetails()
    }//end of class