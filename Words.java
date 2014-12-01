/*

@author	ET
@date	nov 2014

*/
public class Words{
	//declare vars
	private String[] words;
	private String[] starWords;
	private String word;
	private StringBuffer sb;

	//constructor
	public Words(){
		 words = new String[5];
		 starWords  = new String[5];
		 word = new String();
		 sb = new StringBuffer();
	}

	//set method
	public void setWords(String [] words){
		this.words = words;
	}
	public String getStarWords(int index){
		return starWords[index];
	}


	//compute
	public void compute(){
		// loop through word array to convert each word at a time
		for (int j = 0; j < words.length; j++){
			word = words[j]; //extract each word

			//core - loop through and create starword
			sb = new StringBuffer();
			for (int i = 0; i < word.length(); i++){
				sb.append('*');
			}
			starWords[j] = sb.toString();
		}
	}
	// get method
	public String[] getStarWords(){
		return starWords;
	}


}
