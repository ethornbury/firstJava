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
            String resp = "";
           
            //declare and create objects
            Scanner kb = new Scanner(System.in);
            
            //Game myGame, myRound;
            Game myGame = new Game();
            
            //ask user if they would like to play    
            System.out.println("Rock - paper - scissors!");  
            System.out.println("Would you like to play Rock-Paper-Scissors with me? y/n");
	    resp = kb.next();
            while(resp.equalsIgnoreCase("y")){
            System.out.println("Enter the amount of games to play"); 
            gameNum = kb.nextInt();   
                
             // play games
            myGame.playGames();

            //display stats
            myGame.displayDetails();
            }
        System.out.println("ok, we're done here!");    
    }
}