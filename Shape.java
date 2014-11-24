/*
*	File:		Shape.java
*	@author:	Emer Thornbury
*   			x13123173
*	@date:		20/11/14
*
*	desc of class
*
*=====================================
*/
public class Shape{
	//declare vars - only generic ones
	protected double area;
	protected double perimeter;
	private String shapeName;

	//constructor
	public Shape(String shapeName){
		this.shapeName = shapeName;
	}

	//set method
	public void setShapeName(String shapeName){
		this.shapeName = shapeName;
	}

	//process
	public void computeArea(){
		area = 0;
	}
	public void computePerimeter(){
		perimeter = 0;
	}
	public void displayDetails(){
		System.out.println(shapeName);
	}

	//get method
	public double getArea(){
		return area;
	}
	public double getPerimeter(){
		return perimeter;
	}

}