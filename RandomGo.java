/*
*	File:		Round.java	
*	@author:	Emer Thornbury 
*   	studentID:	x13123173
*	@date:	20/11/14	
*
*	sub class inherits from Game.java
*	instantiable class to generate computer random choice for Rock-Paper-Scissors
*=====================================
*/
public class RandomGo{
    //declare vars
    protected int cGo;
    
    //constructor
    public void RandomGo(){
    }
    
    //process
    public void CreateGo() {
		cGo = (int)(Math.random()*3) + 1; 	//tested and generates the random number between [1, 3]
		System.out.println("cGo random " + cGo); //testing purposes	
	}
    
    //getter
    public int getCGo(){
	return cGo;
	} 
  
}
