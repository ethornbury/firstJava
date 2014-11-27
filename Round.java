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
	private int uLife; //user life
	private int cLife; //computer life
	private int uGo;
	private int cGo;
	
	// declare and create arrays
	protected int[][] uGoes = new int[50][50];; //user guesses for all rounds in game
	protected int[][] cGoes = new int[50][50]; //computer guesses for all rounds in game
	protected int[][] roundStats = new int [50][50];
	
	//private int uRoundW;     //?
	//private int cRoundW;     //?
	//private int uRoundL;     //?
	//private int cRoundL;     //?
	//private int uRoundD;     //?
	//private int cRoundD;     //?
		
	// constructor
	public Round(int gameNum){
		super(int gameNum);
                uLife = 3;
                cLife = 3;
                int r = 0;
	
	}
	
	
	// set method
	
	
	// give explanation and get user guess
	
	System.out.println("rock = 1\npaper = 2\nscissors = 3\nAnd your guess is: (1/2/3)");
	//System.out.println("paper = 2");
	//System.out.println("scissors = 3");	
	//System.out.println("And your guess is: (1/2/3)");
	uGo = kb.nextInt();
	
	// create computer random guess
	public void CreateGo(){
            this.cGo = cGo;
        }
	
	// loop for rounds till life ends - execute while uLife more than 0.
	for (int i=1; uLife>0; i++){
		System.out.println("Round number " + i);
		System.out.println("And your guess is: (1/2/3)");
		uGo = kb.nextInt();
		
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
	
			} //end of if loop
	
			// display details
	
		} // end of for loop
	@override	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("heigth: "+heigth);
		System.out.println("width: "+width);
	}
	
		
}// end of instantiable class



