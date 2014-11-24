/*
*	File:		Rectangle.java
*	@author:	Emer Thornbury
*   			x13123173
*	@date:		20/11/14
*
*	this class inherits from superclass Shape.java
*   it has access to all in Shape.java
*=====================================
*/
public class Rectangle extends Shape {
	//declare vars
	private double width;
	private double heigth;

	//constructor
	public Rectangle(String shapeName, double width, double heigth){
		super(shapeName);
		this.heigth = heigth;
		this.width = width;
	}

	//compute the areA
	public void computeArea(){
		area = width * heigth;
	}
	//compute perimeter
	//public void computePerimeter(){
	//	perimeter = ;
	//}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("heigth: "+heigth);
		System.out.println("width: "+width);
	}

}