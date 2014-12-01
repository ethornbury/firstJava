/*
*	File:		Game.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:		20/11/14	
*
*	Super class
*	play a game of Rock-Paper-Scissors
*=====================================
*/

import java.util.Scanner;
public class Game{
	
	// declare vars
	protected int gameNum;
	protected  int uGo;
	
        //declare and create objects
        Scanner kb = new Scanner(System.in);
        ARound myRound = new ARound();
        
        // constructor
        public Game(){
           this.gameNum = gameNum; 
        }   
        
        // process
        public void playGames(){
            //loop to play games
            System.out.println("So you don't have to type long words, we will use numbers!");
            System.out.println("Rock - paper - scissors!");
            System.out.println("Enter your choice:");
            System.out.println("1 = rock");
            System.out.println("2 = paper");
            System.out.println("3 = scissors");
            uGo= kb.nextInt();
            
            do{
            myRound.playRounds();
            // get winner
            //System.out.println("And my choice is "+cGo);
            gameNum--;
            }while (gameNum>0);
        }        
                //display stats
        public void displayDetails(){
            //display
        };
}