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
	private int uGo;
	private int cGo;
	private int uGoes[][]; //user guesses for all rounds in game
	private int cGoes[][]; //computer guesses for all rounds in game
	
	//private String guess[]; //?
	private int uRoundW;     //?
	private int cRoundW;     //?
	private int uRoundL;     //?
	private int cRoundL;     //?
	private int uRoundD;     //?
	private int cRoundD;     //?
	private int roundStats[][]; //
	
	//create arrays
	uGoes = new int[50][50];
	cGoes = new int [50][50];
	roundStats = new int [50][50];
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
	uGo = kb.nextInt();
	
	//create computer random guess, gives a random integer
	public void CreateGo() {
		cGo = (int)(Math.random()*3) + 1; 	//tested and generates the random number between [1, 3]
		System.out.println("cGo random " + cGo);			//testing purposes
		return cGo;
	}
	
	// loop for round - do while ulife more than 0.
	for (int i=1; ulife>0; i++){
		System.out.println("Round number " + i);
		System.out.println("And your guess is: (1/2/3)");
		uGo = kb.nextInt();
		
		Round myRound = new CreateGo();
		// compare 
		if(uGo == cGo){
			uRoundD++; cRoundD++
			System.out.println("Hey Draw!!");
			break;
			
			}else if(uGo ==3 && cGo ==2){ //scis beats paper - u wins
			System.out.println("Hey you win!!");
			
			}else if(uGo ==3 && cGo ==1){//scis loses to rock - computer win
			System.out.println("Ha I win!!");
			ulife--;
			
			}else if(uGo ==2 && cGo ==3){//comp win
			System.out.println("Loser! I win!");
			ulife--;
			
			}else if(uGo ==2 && cGo ==1){//user wins
			System.out.println("You win!!");
			
			
			}else if(uGo ==1 && cGo ==2){//comp wins
			System.out.println("I'm the winner!!");
			ulife--;
			
			}else if(uGo ==1 && cGo ==3){//user wins
			System.out.println("Rats, you win!!");
			
			
			}else{
			//stop your messing and put in valid turn!
			System.out.println("That's not going to get you anywhere! Quit messing and put in 1/2/3: ");
			i--; //do not increment i as not a valid turn, still the same round.
			System.out.println("check i counter " +i);
			//end of if-else 
		
		
		
	
	} //end of for loop
	
	// display details
	
} // end of instantiable class


