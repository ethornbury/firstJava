/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Winner {
 // declare and create arrays in method so no reset needed
	String[][] shapeStat = new String[50][2]; //[rounds][user shape,computer shape]    
        int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]
        int gameStat = new int[5]; //[gameNum, uw,ul,cw,cl]
        int[][] roundStatW = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]
	//constructor
	public Winner(){

	}

	//setter
	public void setRoundStat(int roundStat[][]){
		this.roundStat = roundStat;
	}

	//getter
	public int[][] getRoundStat(){
		return roundStat;
	}

	//process
	public void computeRoundWin(){
		//create array
		roundStatW = new int[temp.length][2];

		//traverse array
		for(int i = 0; i < .length; i++){
			//initialise the min with first
			roundStatW[i][0] = temp[i][0];
			//initialsie the max
			roundStatW[i][1] = temp[i][0];

			for(int j = 0; j<temp[i].length;j++){
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
        
        public void computeGameWin(){
		//create array
		roundStatW = new int[temp.length][2];

		//traverse array
		for(int i = 0; i < .length; i++){
			//initialise the min with first
			roundStatW[i][0] = temp[i][0];
			//initialsie the max
			roundStatW[i][1] = temp[i][0];

			for(int j = 0; j<temp[i].length;j++){
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
