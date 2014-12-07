 /*
*	File:		GameApp.java
*	@author:	Emer Thornbury
*   	studentID:	x13123173
*	@date:		20/11/14
*
*	main method to see if user wants to play R-P-S or not
*       
*=====================================
*/
import java.util.Scanner;
public class GameApp{
	public static void main(String args[]){
            // declare vars
            String response;

            //declare and create objects
            Scanner kb = new Scanner(System.in);
            GameGo myGame = new GameGo();

            //ask user if they would like to play
            System.out.println("\n\tRock - paper - scissors!\n");
            System.out.println("Would you like to play Rock-Paper-Scissors with me? y/n");
	    	response = kb.next();

            while(response.equalsIgnoreCase("y")){
                // play games
                myGame.PlayGames();
              
            }//end while loop

            System.out.println("ok, we're done here!");
        }//end main method
}// end App class