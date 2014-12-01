/*

@author	ET
@date	nov 2014

*/
import java.util.Scanner;
public class WordsApp{
	public static void main(String args[]){

		// declare vars
		String word = new String();
		String[] words = new String[5];
		String[] starWords = new String[5];
		int index = 0;
		String resp;

		//declare objects and creating
		Scanner sc = new Scanner(System.in);
		Words myWords = new Words();

		//get 5 words from user
		for (int i = 0; i < words.length; i++){
			System.out.println("Please enter word number " +(i+1));
			words[i] = sc.next(); //place word in the array

		}

		//set
		myWords.setWords(words);//send array to instantiable class

		//process
		myWords.compute();

		//call get method
		starWords = myWords.getStarWords();

		//
		for (int i = 0; i < words.length; i++){
			System.out.println("Word number "+i+", "+words[i] + " converted is "+ starWords[i]);

		}
		do{
		System.out.println("Please select the number of the word you wish to see 1,2,3,4,5 ");
		index = sc.nextInt();
		System.out.println("The word is " + words[index-1] + " converted " + myWords.getStarWords(index-1));
		System.out.println("Would you like to see another word? y/n");
		resp = sc.next();
		}while(resp.equalsIgnoreCase("y"));
	}


}