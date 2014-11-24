/* Mark.java
instantiable class
@author et
*/

public class Marks{
	//declare
	private int c;
	private double grade;
	private double avg = 0;
	private double sum =0;

	//constructor
	public Marks(){
	}
	//set
	public void setGrade(double grade){
		this.grade = grade;
	}
	public void setC(int c){
		this.c = c;
	}

	//compute
	public void compute(){
		sum = sum + grade;
		avg = sum/c;
	}

	//get method
		public double getAvg(){
			return avg;
	}
	public int getCount(){
				return c;
		}

}