/*
*
*
*/
public class Temperature{
	//declare instance vars
	private double temp[][];
	private double tempMinMax[][];

	//constructor
	public Temperature(){

	}

	//setter
	public void setTemp(double temp[][]){
		this.temp = temp;
	}

	//getter
	public double[][] getTempMinMax(){
		return tempMinMax;
	}

	//process
	public void computeMinMax(){
		//create array
		tempMinMax = new double[temp.length][2];

		//traverse array
		for(int i = 0; i < temp.length; i++){
			//initialise the min with first
			tempMinMax[i][0] = temp[i][0];
			//initialsie the max
			tempMinMax[i][1] = temp[i][0];

			for(int j = 0; j<temo[i].length;j++){
				//i is current row,
				//j is current column
				//initialise currentElement
				double currentElement = temp[i][j];
				if (currentElement <tempMinMax[i][0]){
					tempMinMax[i][0] = currentElement;
				}
				if(currentElement > tempMinMax[i][1]){
					//currentElement is new max
					tempMinMax[i][1] = currentElement;
				}

			}

		}//end of first traverse

	}//end of compute()


}//end of class