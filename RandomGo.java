/*
*	File:		Round.java
*	@author:	Emer Thornbury
*   	studentID:	x13123173
*	@date:	20/11/14
*
*
*	instantiable class to generate computer random choice for Rock-Paper-Scissors
*=====================================
*/
public class RandomGo{
    //declare vars
    private int cGo;

    //constructor
    public void RandomGo(){
    }

    //process to create a random choice
    public void CreateGo() {
	cGo = (int)(Math.random()*3) + 1; 	//tested and generates the random number between [1, 3]
	//System.out.println("cGo random in randomGo{}  " + cGo); //testing purposes
    }

    //getter
    public int getCGo(){
        return cGo;
    }

    // process to translate choices from integer to String
    public void intShape(){
		if(uGo = 1 || cGo = 1){
			uGoShape = "Rock";
			cGoShape = "Rock";
		}
		if(uGo = 2 || cGo = 2){
			uGoShape = "Paper";
			cGoShape = "Paper";

		}
		if(uGo = 3 || cGo = 3){
			uGoShape = "Scissors";
			cGoShape = "Scissors";
		}
	}

	public String getIntShape(){
		return uGoShape;
		return cGoShape;
	}

}