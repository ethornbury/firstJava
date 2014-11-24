/*
*	File:		ShapeApp.java
*	@author:	Emer Thornbury
*   			x13123173
*	@date:		20/11/14
*
*	desc of class
*
*=====================================
*/
public class ShapeApp{
	public static void main(String args[]){
		// variable declaration of the superclass type

		Shape myShape, myRectangle;

		//constructor with parameter as constructor in Shape.java has parameters in constructor
		myShape = new Shape("a shape");

		myRectangle = new Rectangle("a rectangle", 4, 2.5);
		// processing
		myShape.computeArea();
		myShape.displayDetails();

		// output
		System.out.println(myShape.getArea());

		//process
		myRectangle.computeArea();
		myRectangle.displayDetails();

		//output
		System.out.println(myRectangle.getArea());
	}
}