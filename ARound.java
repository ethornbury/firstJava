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
import java.util.Scanner;
public class ARound{

	// declare vars
	private int uLife; //user life
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
        Scanner kb = new Scanner(System.in);
        
	// constructor
	public ARound(){
		//
                uLife = 3; 
                System.out.println("ulife "+uLife);
                System.out.println("cGo "+cGo);
	}
	
	
	// get method
    
	//cGo = RandomGo.getCGo();
        
        //process
	public void playRounds(){
	
	// give explanation and get user guess
	//System.out.println("rock = 1\npaper = 2\nscissors = 3\nAnd your guess is: (1/2/3)");
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
                        // draw types
                       
                        switch (uGo){
				case 1:
					System.out.println("You choose Rock");
					break;

				case 2:
					System.out.println("You choose Paper");
					break;
				case 3:
					System.out.println("You choose Scissors");
					break;
				default:
					System.out.println("Thats shite!");
					break;
					}
                        switch (cGo){
				case 1:
					System.out.println("I choose Rock");
					break;

				case 2:
					System.out.println("I choose Paper");
					break;
				case 3:
					System.out.println("I choose Scissors");
					break;
				default:
					System.out.println("Thats shite!");
					break;
					}
                        
                        //System.out.println("You choose "+uGo);
                        //System.out.println("I choose "+cGo);
                               
			//result draw
			uGoes[i][i]= "Draw";
                        cGoes[i][i]= "Draw";
                        
			}else if(uGo ==3 && cGo ==2){ 
			System.out.println("Hey you win!!");
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Paper");
			// user wins
                        uGoes[i][i]= "Won";
                        uRoundD++;
                        cGoes[i][i]= "Lost";
                        
			}else if(uGo ==3 && cGo ==1){
			System.out.println("Ha I win!!");
			uLife--;
			// computer wins
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Rock");
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
			}else if(uGo ==2 && cGo ==3){
			System.out.println("Loser! I win!");
			uLife--;
                        System.out.println("You choose Paper");
                        System.out.println("I choose Scissors");
			// computer win
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
			}else if(uGo ==2 && cGo ==1){
			System.out.println("You win!!");
                        System.out.println("You choose Paper");
                        System.out.println("I choose Rock");
			// user wins
			uGoes[i][i]= "Won";
                        cGoes[i][i]= "Lost";
                        
			}else if(uGo ==1 && cGo ==2){
			System.out.println("I'm the winner!!");
			uLife--;
                        System.out.println("You choose Rock");
                        System.out.println("I choose Paper");
			// computer wins
                        uGoes[i][i]= "Lost";
                        cGoes[i][i]= "Won";
                        
			}else if(uGo ==1 && cGo ==3){
			System.out.println("Rats, you win!!");
                        System.out.println("You choose Rock");
                        System.out.println("I choose Scissors");
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
	
	public void displayDetails(){
		System.out.println("Rock - paper - scissors! display stats in ARound.java");
		
	}    
        
}// end of instantiable