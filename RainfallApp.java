/*
RainfallApp.java
ET
nov 2014
manage a 2D array
*/
import java.util.Scanner;
public class RainfallApp{
	public static void main(String args[]){
		// declare vars
		int rain[][];
		double avg;
		int sum = 0;

		//create array space in memory
		rain = new int [4][7];

		//create and declare object
		Scanner sc = new Scanner(System.in);

		//input
		for (int i = 0; i < rain.length; i++){
			for (int j = 0; j < rain[i].length; j++){
				System.out.println("enter the rainfall for week"+ (i+1)+ " and day "+(j+1));
				rain[i][j] = sc.nextInt();
			}
		}
		//process
		int cells = 0;
		for (int i = 0; i < rain.length; i++){
					for (int j = 0; j < rain[i].length; j++){
						cells++;
						sum = sum + rain[i][j];

					}
					System.out.println(cells +" cells");
		}
		avg = (double)sum / cells;
		//return info
		System.out.println("average rainfall is "+ avg);

	}
}
