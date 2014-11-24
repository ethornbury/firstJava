/*
*	File:		Game.java	
*	@author:	Emer Thornbury 
*   			x13123173
*	@date:		20/11/14	
*
*	desc of class
*
*=====================================
*/

public class Game{
	
	// declare vars
	private int uguess;
	private int cguess = 0;
	
	
	// get input from user
	// declare and create objects
	Scanner sc = new Scanner(System.in);
	System.out.println("Rock - paper - scissors!");
	System.out.println("Enter your choice:");
	System.out.println("1 = rock");
	System.out.println("2 = paper");
	System.out.println("3 = scissors");
	uguess= sc.nextInt();
	
	// get winner
	System.out.println("And my choice is "+cguess);
	

}