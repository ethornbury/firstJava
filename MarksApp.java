/* MarkApp.java
// page 2645 computing support
@author et
*/
import java.util.Scanner;
public class MarksApp{
	public static void main(String args[]){
		// declare vars
		double grade;
		double avg;
		double average = 0;
		char resp;
		int c = 0;

		// declare objects
		Scanner sc;
		Marks goGrade;

		//create objects
		sc = new Scanner(System.in);
		goGrade = new Marks();

		System.out.println("Enter marks and the system will return the average.");
		System.out.println();

		do{
			System.out.println("Enter grade: ");
			grade = sc.nextDouble();
			goGrade.setGrade(grade);
			c = c+1;
			goGrade.setC(c);
			//process
			goGrade.compute();

			System.out.println("Add another grade y/n");
			resp = sc.next().charAt(0);

		} while(resp == 'y');

		//get
		average = goGrade.getAvg();

		c = goGrade.getCount();

		//output response to user
		System.out.println("The average grade of "+ c +" students is "+ average +" marks.");
	}
}