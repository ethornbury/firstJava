/*
*	File:		Round.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:	20/11/14	
*	
*	instantiable class for a round of Rock-Paper-Scissors
*=====================================
*/
import java.util.Scanner;
public class Round{

	// declare vars
	private int uLife; //user life
	private int uGo;
	private int cGo;
        private int uRound;     
	private int cRound;
        private int roundNum;
	
	// declare and create arrays
	private String[][] uGoes = new String[50][50];; //user stats (a,b = rounds,result)
	private String[][] cGoes = new String[50][50]; //computer stats (a,b = rounds,result)
	private String[][] roundStats = new String[50][50];
 
        //declare and create objects
        Scanner kb = new Scanner(System.in);
        RandomGo myRandomGo = new RandomGo();
        cGo = myRandomGo.getCGo();
	// constructor
	public Round(){
            //initialise vars
            uLife = 3;   
	}
	
	// get
        
        
        //process to create random go
        //public void CreateGo() {
	//	cGo = (int)(Math.random()*3) + 1; 	//tested and generates the random number between [1, 3]
	//	System.out.println("cGo random " + cGo); //testing purposes	
	//}       
       
        //process
	public void PlayRounds(){
	
	// give explanation and get user guess
	//System.out.println("rock = 1\npaper = 2\nscissors = 3\nAnd your guess is: (1/2/3)");
	//System.out.println("paper = 2");
	//System.out.println("scissors = 3");	
	
	// loop for rounds - execute while uLife more than 0.
            for (int i=1; uLife > 0; i++){
		System.out.println("Round number " + i);
		System.out.println("And your guess is: (1/2/3)");
		uGo = kb.nextInt();
                
		// compare 
		if(uGo == cGo){
                    System.out.println("Random go in if statement  " + cGo);
                    uRound++; cRound++;
                    System.out.println("Hey Draw!!");
                        
                    // draw types                      
                    switch (cGo){
			case 1:
                            System.out.println("We both choose Rock");
                            break;

			case 2:
                            System.out.println("We both choose Paper");
                            break;
			case 3:
                            System.out.println("We both choose Scissors");
                            break;
			default:
                            System.out.println("Oops somethings wrong!");
                            break;
			}                                        
			//result draw
                    uGoes[i][i]= "Draw";
                    cGoes[i][i]= "Draw";
                        
                }else if(uGo ==3 && cGo ==2){ 
			System.out.println("Hey you win!!");
                        System.out.println("You choose Scissors");
                        System.out.println("I choose Paper");
			// user wins
                        uGoes[i][i]= "Won";
                        uRound++;
                        cGoes[i][i]= "Lost";
                        
                        System.out.println("Random go in else if statement  " + cGo);
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
			
		}else {
			System.out.println("That's not going to get you anywhere! Quit messing and put in 1/2/3: ");
			//i--; //do not increment i as not a valid turn, still the same round.
			System.out.println("check i counter " +i);
			//end of if-else 
	
		} //end if loop
                        
			// display details
            }//end for loop
        }//end process
	//process
	
//		for (int i = 0; i < rain.length; i++){
//                    for (int j = 0; j < rain[i].length; j++){
//			cells++;
//			sum = roundStats[roundNum][j];//j 4 cols
//                        System.out.println(" cells"+roundStats[roundNum][j]);
//			}
//                    System.out.println(" cells"+roundStats[roundNum][j]);
//		}
                
                
                
	public void DisplayDetails(){
            System.out.println("Rock - paper - scissors! \nThe Stats for this Round");
            for (int i = 0; i < roundNum; i++){
                    for (int j = 1; j <= 5; j++){
			sum = roundStats[roundNum][j];//j 4 cols
                        System.out.println(" cells"+roundStats[roundNum][j]);
			}
                    System.out.println(" round "+roundStats[roundNum][j]);
		}
            
            
        }    
}// end of instantiable