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
    private int uGo;
    private String uGoShape;
	private String cGoShape;

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

	//

	public void setUGo(int uGo){
		this.uGo = uGo;
	}

	public void setCGo(int cGo){
		this.cGo = cGo;
	}

    // process to translate choices from integer to String
    public void intShape(){

		if(uGo == 1){
			uGoShape = "Rock";
			cGoShape = "Rock";
		}
		if(cGo == 1){
			uGoShape = "Rock";
			cGoShape = "Rock";
		}
		if(uGo == 2){
			uGoShape = "Paper";
			cGoShape = "Paper";
		}
		if(cGo == 2){
			uGoShape = "Paper";
			cGoShape = "Paper";
		}
		if(uGo == 3){
			uGoShape = "Scissors";
			cGoShape = "Scissors";
		}
		if(cGo == 3){
			uGoShape = "Scissors";
			cGoShape = "Scissors";
		}
	}

	public String getIntShapeU(){
		return uGoShape;
	}
	public String getIntShapeC(){
			return cGoShape;
	}

}