/*
*	File:		RandomTest.java	
*	@author:	Emer Thornbury 
*   			x13123173
*	@date:		20/11/14	
*
*	desc of class
*
*=====================================
*/
import java.util.Scanner;
public class RandomTest{
	public static void main(String args[]){
		int randomNumber;
		int i = 0;
		
		// declare and create 
		Random rnd = new Random();
		// int randomNumber = random.nextInt(max - min) + min;
		System.out.println("random 1-3");
		// 
		
		for (i = 0; i>6; i++){
			i++;
			
			randomNumber = rnd.nextInt(4 - 1) + 1;
			//function getRandomInt(1, 4){
			//	return rn =  Math.floor(Math.random() * (4 - 1)) + 1;
			System.out.println(randomNumber);
		};
		
	}
}