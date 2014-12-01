/*
*	File:		GameApp.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:		20/11/14	
*
*	main method
*
*=====================================
*/
import java.util.Scanner;
public class GameApp{
	public static void main (String args[]){
            // declare vars
            int gameNum;
            // exception;
           
            //declare and create objects
            Scanner kb = new Scanner(System.in);
            
            //Game myGame, myRound;
            Game myGame = new Game();
            
            //ask user if they would like to play
            System.out.println("Would you like to play Rock-Paper-Scissors with me?");
            System.out.println("Enter the amount of games or 0 to exit"); 
            gameNum = kb.nextInt();
             
                      
            //statement for playing or leaving
            switch (gameNum){
                case 0:
                   System.out.println("Another time so!");
                   break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                     // play games
                    myGame.playGames();

                    //display stats
                    myGame.displayDetails();
                    break;
                default:
                    gameNum = !kb.hasNextInt();
                    System.out.println("Thats not valid idiot!");
                    break;
            }
    }
}