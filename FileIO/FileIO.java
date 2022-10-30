import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileIO {

	public String[] fileToArray(){
		String[] wordArray = null;	

		return wordArray;
	}

	public String findLongeStringWord(String[] wordArray)
	{ 
		String longestWordString = "";
		if (wordArray.length != 0) {
			for(int i = 0; i >= longestWordString.length(); i++) {
			}
		}
		
		return longestWordString;
	}
	

	public static void main(String[] args) throws Exception{

		FileReader fr = new FileReader("example.txt");    
		BufferedReader br = new BufferedReader(fr); 

		int i;    
		while((i=br.read())!=-1)
			System.out.print((char)i);
		
		char wordsString = ((char)i);

		br.close();    
		fr.close();   
	}

}
