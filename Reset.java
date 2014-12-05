/*
*	File:		XXXXX.java
*	@author:	Emer Thornbury
*   			x13123173
*	@date:		20/11/14
*
*	desc of class
*
*=====================================
*/
public class Reset{
	// declare vars
	private int gameNum;
	private String[][] uGoes = new String[50][50];; //user stats (a,b = rounds,result)
	private String[][] cGoes = new String[50][50]; //computer stats (a,b = rounds,result)
    private String[][] roundStats = new String[50][50];

	//constructor
	public Reset(){
	}

	public void ResetAll(){
		System.out.println("Reset all the arrays");

	}

}