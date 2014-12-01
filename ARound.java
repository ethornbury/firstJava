/*
*	File:		ARound.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:	20/11/14	
*
*	sub class inherits from Game.java
*	instantiable class for a round of Rock-Paper-Scissors
*=====================================
*/
public class ARound{

	// declare vars
	private int uLife; //user life
	private int cLife; //computer life
	private int uGo;
	private int cGo;
        private int uRoundD;     //?
	private int cRoundD;     //?
	
	// declare and create arrays
	protected String[][] uGoes = new String[50][50];; //user stats (a,b = rounds,result)
	protected String[][] cGoes = new String[50][50]; //computer stats (a,b = rounds,result)
	protected int[][] roundStats = new int [50][50];

        //declare and create objects
        RandomGo myRandomGo = new RandomGo();
        
	// constructor
	public ARound(){
		//super(int gameNum);
                uLife = 3; 
                System.out.println("ulife "+uLife);
                cLife = 3;
                System.out.println("clife "+cLife);
                this.cGo = cGo;
                System.out.println("cGo "+cGo);
	}
	
	
	// set method
        
        //process
	public void playRounds(){
	
	// give explanation and get user guess
	System.out.println("rock = 1\npaper = 2\nscissors = 3\nAnd your guess is: (1/2/3)");
	//System.out.println("paper = 2");
	//System.out.println("scissors = 3");	
	//System.out.println("And your guess is: (1/2/3)");
	
	// loop for rounds - execute while uLife more than 0.
	for (int i=1; uLife > 0; i++){
		System.out.println("Round number " + i);
		System.out.println("And your guess is: (1/2/3)");
		uGo = kb.nextInt();
		myRandomGo.CreateGo();
                
		// compare 
		if(uGo == cGo){
			uRoundD++; cRoundD++;
			System.out.println("Hey Draw!!");
			//result draw
			uGoes[i][i]= "Draw";
                        cGoes[i][i]= "Draw";
                        
			}else if(uGo ==3 && cGo ==2){ 
			System.out.println("Hey you win!!");
			// user wins
                        uGoes[i][i]= "Won";
                        cGoes[i][i]= "Lost";
                        
			}else if(uGo ==3 && cGo ==1){
			System.out.println("Ha I win!!");
			uLife--;
			// computer wins
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
			}else if(uGo ==2 && cGo ==3){
			System.out.println("Loser! I win!");
			uLife--;
			// computer win
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
			}else if(uGo ==2 && cGo ==1){
			System.out.println("You win!!");
			// user wins
			uGoes[i][i]= "Won";
                        cGoes[i][i]= "Lost";
                        
			}else if(uGo ==1 && cGo ==2){
			System.out.println("I'm the winner!!");
			uLife--;
			// computer wins
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
			}else if(uGo ==1 && cGo ==3){
			System.out.println("Rats, you win!!");
			// user wins
                        uGoes[i][i]= "Won";
                        cGoes[i][i]= "Lost";                     
			
			}else{
			System.out.println("That's not going to get you anywhere! Quit messing and put in 1/2/3: ");
			//i--; //do not increment i as not a valid turn, still the same round.
			System.out.println("check i counter " +i);
			//end of if-else 
	
			} //end of if loop
                        
			// display details
	
		} // end of for loop
}
	//@Override	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("heigth: ");
		System.out.println("width: ");
	}
	
		
}// end of instantiable class



