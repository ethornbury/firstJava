/*
*	File:		Round.java	
*	@author:	Emer Thornbury 
*   			x13123173
*	@date:	20/11/14	
*
*	sub class inherits from Game.java
*	instantiable class for a round of Rock-Paper-Scissors
*=====================================
*/
public class Round extends Game{

	// declare vars
	private int ulife; //user life
	private int clife; //computer life
	private int uGuess;
	private int cGuess;
	private int uGuessR[][]; //user guesses for all rounds in game
	private int cGuessR[][]; //computer guesses for all rounds in game
	private String guess[]; //?
	private int uRound;     //?
	private int cRound;     //?
	private int roundStats[][]; //
	
	// constructor
	public void Round(){
		ulife = 3;
		clife = 3;
		r = 0;
		// initialise stuff
	}
	
	Scanner kb = new Scanner(System.in);
	// set method
	
	
	// do a round - give explanation and get user guess
	System.out.println("So you don't have to type long words, we will use numbers!");
	System.out.println("rock = 1");
	System.out.println("paper = 2");
	System.out.println("scissors = 3");	
	System.out.println("And your guess is: (1/2/3)");
	uGuess = kb.nextInt();
	
	//create computer random guess, gives a random intege
		public void CreateGuess() {
			cGuess = (int)(Math.random()*3) + 1; 	//tested and generates the random number between [1, 3]
			System.out.println("cGuess random " + cGuess);				//testing purposes
		}
	
	// loop for round
	for (int i=1; i<7; i++){
		
	
	}
	
	// display details
	
}


