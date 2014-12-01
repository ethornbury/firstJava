/* stars.java

@author et
*/
import java.util.Scanner;
public class Stars{
	public static void main(String args[]){
		// declare vars
		String word;

		//declare objects and create
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter word:");
		word = sc.next(); //takes in only a word

		int len = word.length();
		//process
		for (int i = 0; i < len; i++){
			System.out.print("*");
		}
		System.out.println();
	}
}