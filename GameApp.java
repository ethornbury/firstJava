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
            
            //declare and create objects
            Scanner kb = new Scanner(System.in);
            Game myGame, myRound, myRandomGo;
            
            //ask user if they would like to play
            System.out.println("Would you like to play Rock-Paper-Scissors with me?");
            System.out.println("Enter the amount of games or 0 to exit"); 
            
            gameNum = kb.nextInt();
            
            
            if (gameNum == 0){
                System.out.println("Another time so!");
             }else{
                // play games
                myGame.playGames();
                
                //display stats
                myGame.displayDetails();
            }	
	}		
}
