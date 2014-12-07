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
import java.util.Scanner;
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

	//setters

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
		}
		if(cGo == 1){
			cGoShape = "Rock";
		}
		if(uGo == 2){
			uGoShape = "Paper";
		}
		if(cGo == 2){
			cGoShape = "Paper";
		}
		if(uGo == 3){
			uGoShape = "Scissors";
		}
		if(cGo == 3){
			cGoShape = "Scissors";
		}
                //System.out.println(cGoShape + " c shape and  u "+uGoShape);//testing
	}

	public String getShapeU(){
              //System.out.println("in getter c shape and  u "+uGoShape);//testing
		return uGoShape;
	}
	public String getShapeC(){
              //System.out.println(cGoShape + "ingetter c shape");//testing
		return cGoShape;
	}

}