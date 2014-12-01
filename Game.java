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
	
        Scanner kb = new Scanner(System.in);
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

            // get winner
            System.out.println("And my choice is "+cGo);
            
        };
            
        
                //display stats
        public void displayDetails(){
            
        };
	//while (games >0){
		//	init computerGuess
		//	init personGuess
		//	init games, rounds
			
		//	Scanner info()
		//	play games()
		//	create array of stats()
		//}
		//get overall game stats()
		//loop to traverse the array and display stats
		//print result()

}