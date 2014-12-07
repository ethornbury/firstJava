/*
*	File:		Winner.java
*	@author:	Emer Thornbury
*   	studentID:	x13123173
*	@date:		7/12/14
*
*
*	instantiable class in game of Rock-Paper-Scissors
*=====================================
*/
public class Winner {
 // declare and create arrays
        private int[][] roundStat = new int[100][6]; //[possible rounds][uw,ul,ud,cw,cd,cl]
        private int gameStat = new int[5]; //[gameNum, uw,ul,cw,cl]
        private int[][] roundStatW = new int[100][2]; //[possible rounds][uw,ul,d]
	private int r;
        //constructor
	public Winner(){
	}

	//setter
	public void setRoundStat(int roundStat[][]){
		this.roundStat = roundStat;
	}
        public void setR(int r){
            this.r = r;
        }

	//getter
	public int[][] getRoundStat(){
		return roundStatW;
	}

	//process
	public void computeRoundWin(){
		//create array
		roundStatW = new int[100][2];

		//traverse array
		for(int i = 0; i < r; i++){
			//initialise the min with first
			roundStatW[i][0] = [i][0];
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
