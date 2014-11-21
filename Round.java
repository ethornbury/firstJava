/*
*	File:		Round.java	
*	@author:	Emer Thornbury 
*   			x13123173
*	@date:	20/11/14	
*
*	to play a round of Rock Paper Scissors
*
*=====================================
*/

public class Round{
	// declare vars
	private int r;
	private int ulife;
	private int clife;
	private int uguess;
	private int cguess;
	private String guess[];
	private int uround;
	private int cround;
	private int roundStats[];
	private int rn;
	// constructor
	public Round(){
		ulife = 3;
		clife = 3;
		r = 0;
		// initialise stuff
	
	}
	
	// set method
	
	
	// do a round
	// get user guess
	System.out.println("rock = 1");
	System.out.println("paper = 2");
	System.out.println("scissors = 3");
	System.out.println("And your guess is: (1/2/3)");
	uguess = sc.next();
	
	// compter guess
	cguess = Math.random()
	// Returns a random integer between min (included) and max (excluded)
	// Using Math.round() will give you a non-uniform distribution!
	function getRandomInt(1, 4) {
	return rn =  Math.floor(Math.random() * (4 - 1)) + 1;
}
	
	// get method


}