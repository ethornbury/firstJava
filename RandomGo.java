/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class RandomGo extends Game{
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
    public double getCGo(){
		return cGo;
	}
}
