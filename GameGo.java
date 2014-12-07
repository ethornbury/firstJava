/*
*	File:		Game.java
*	@author:	Emer Thornbury
*   	studentID:	x13123173
*	@date:		20/11/14
*
*	instantiable class to play a game of Rock-Paper-Scissors
*       play games, rounds, collect stats and display 
*=====================================
*/
import java.util.Scanner;
public class GameGo{

    // declare vars
    private int gameNum;
    private int cGameW, uGameW, cGameL, uGameL;
    private int r;
    private int uGo;
    private int cGo;
    private int cWin, uWin, cLose, uLose, draws;
    private int uLife; //user life
    private String uGoShape;
    private String cGoShape; 

    //declare and create objects
    Scanner kb = new Scanner(System.in);
    RandomGo myRandomGo = new RandomGo();

    // constructor
    public GameGo(){
        uLife = 3;
        r = 0; gameNum = -1;
        cWin = 0; cLose = 0; uWin = 0; uLose = 0; draws = 0;
        
    }//end of Game() constructor


    // process
    public void PlayGames(){
        System.out.println("\nEnter the amount of games you would like to play");
        gameNum = kb.nextInt();
        
        //System.out.println("gameNum = "+gameNum); //testing
        if (gameNum > 0){
            // declare and create arrays in method so no reset needed
            String[][] shapeStat = new String[80][2]; //[rounds][user shape,computer shape]
        
            System.out.println("\nSo you don't have to type long words, we will use numbers!");
            System.out.println("rock = 1\npaper = 2\nscissors = 3");

                // loop for rounds - execute while uLife more than 0.
                for ( r=0; uLife > 0; r++){
                    System.out.println("\nRound number " + (r+1));
                    System.out.println("Your number of lives is " + uLife);
                    System.out.println("And your guess is: (1/2/3)");
                    uGo = kb.nextInt();

                    myRandomGo.CreateGo();
                    cGo = myRandomGo.getCGo();

                    // setter, to process to shape
                    myRandomGo.setUGo(uGo);
                    myRandomGo.setCGo(cGo);
                    // process
                    myRandomGo.intShape();
                    // getter
                    uGoShape = myRandomGo.getShapeU();
                    cGoShape = myRandomGo.getShapeC();

                    // System.out.println(cGo + " cGo uGo "+uGo); //testing           
                    //System.out.println(cGoShape  +" cGoShape uGoShape "+ uGoShape); //testing
                    // add to array
                    shapeStat[r][0] = uGoShape;
                    shapeStat[r][1] = cGoShape;

                    // compare
                    if(uGo == cGo){
                        System.out.println("Hey Draw!!");

                        // draw types
                        switch (cGo){
                            case 1:
                                System.out.println("We both choose Rock");
                                draws++;
                                break;

                            case 2:
                                System.out.println("We both choose Paper");
                                draws++;
                                break;

                            case 3:
                                System.out.println("We both choose Scissors");
                                draws++;
                                break;

                            default:
                                System.out.println("Oops somethings wrong!");
                                break;

                            } //end of switch 

                        }else if(uGo ==3 && cGo ==2){
                                System.out.println("Hey you win!!"); // user wins
                                System.out.println("You choose Scissors");
                                System.out.println("I choose Paper");          
                                uWin++; cLose++;

                        }else if(uGo ==3 && cGo ==1){
                                System.out.println("Ha I win!!"); // computer wins
                                uLife--;
                                System.out.println("You choose Scissors");
                                System.out.println("I choose Rock");
                                uLose++; cWin++;

                        }else if(uGo ==2 && cGo ==3){
                                System.out.println("Loser! I win!"); // computer win
                                System.out.println("You choose Paper");
                                System.out.println("I choose Scissors");
                                uLife--;
                                uLose++; cWin++;

                        }else if(uGo ==2 && cGo ==1){
                                System.out.println("You win!!"); // user wins
                                System.out.println("You choose Paper");
                                System.out.println("I choose Rock");
                                uWin++; cLose++;

                        }else if(uGo ==1 && cGo ==2){
                                System.out.println("I'm the winner!!"); // computer wins
                                System.out.println("You choose Rock");
                                System.out.println("I choose Paper");
                                uLife--;
                                uLose++; cWin++;

                        }else if(uGo ==1 && cGo ==3){
                                System.out.println("Rats, you win!!"); // user wins
                                System.out.println("You choose Rock");
                                System.out.println("I choose Scissors");
                                uWin++; cLose++;

                        }else {
                                System.out.println("That's not going to get you anywhere! Quit messing and put in 1/2/3: ");
                                r--; //do not increment i as not a valid turn, still the same round.
                                System.out.println("check round counter " +r); //testing 

                        } //end if loop

                }//end for loop
                // display round stats
                System.out.println("\n\tRound info:");
                System.out.println("Number of Rounds: "+r);
                System.out.println("You won " + uWin +" times.");
                System.out.println("You lost " + uLose +" times.");
                System.out.println("I won " + cWin +" times.");
                System.out.println("I lost " +cLose +" times.");
                System.out.println("There were "+draws+" draws.");
                System.out.println("Not bad!!\n");
                // display shapes
                System.out.println("Below are the shapes you and I chose:");
                System.out.println("Yours \t\t Mine");
                for(int e = 0; e < r; e++){         
                System.out.println(shapeStat[e][0] +"\t\t"+ shapeStat[e][1]);

            }
            // assess game winner
            if (uWin > cWin){
                uGameW++;
                cGameL++;
                }else{
                    cGameW++;
                    uGameL++;
                }
            gameNum--; //-1 game    
            if(gameNum == 0){
                System.out.println("\n\tOk end of game, lets look at the Game stats:"); 
                System.out.println("The number of games played was " + gameNum);
                System.out.println("You won " +uGameW+" times.");
                System.out.println("You lost " +uGameL+" times.");
                System.out.println("I won " +cGameW+" times.");
                System.out.println("I lost " +cGameL+" times.");
                if (uGameW > cGameW){
                    System.out.println("And you're the winner!");
                    }else{
                    System.out.println("I win! Not bad!!");
                }
            }    
        } else {
            System.out.println("Thats the end!");            
        }//end of if(gameNum>0)         
    }//end of PlayGames()
}//end of class