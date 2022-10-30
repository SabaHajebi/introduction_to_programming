/* SELF ASSESSMENT 
1. readDictionary
- I have the correct method definition [Mark out of 5: 5]
- Comment: I have the correct method definition 
- My method reads the words from the "words.txt" file. [Mark out of 5: 5]
- Comment: My method reads the words from the "words.txt" file.
- It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out of 5:5]
- Comment: It returns the contents from "words.txt" in a String array or an ArrayList.

2. readWordList
- I have the correct method definition [Mark out of 5:5]
- Comment: I have the correct method definition 
- My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark out of 5:5]
- Comment: My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it.

3. isUniqueList
- I have the correct method definition [Mark out of 5:5]
- Comment: I have the correct method definition
- My method compares each word in the array with the rest of the words in the list. [Mark out of 5:5]
- Comment: My method compares each word in the array with the rest of the words in the list.
- Exits the loop when a non-unique word is found. [Mark out of 5:5]
- Comment: Exits the loop when a non-unique word is found.
- Returns true is all the words are unique and false otherwise. [Mark out of 5:5]
- Comment: Returns true is all the words are unique and false otherwise. [

4. isEnglishWord
- I have the correct method definition [Mark out of 5:5]
- Comment: I have the correct method definition
- My method uses the binarySearch method in Arrays library class. [Mark out of 3:3]
- Comment: My method uses the binarySearch method in Arrays library class. 
- Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out of 2:2]
- Comment: Returns true if the binarySearch method return a value >= 0, otherwise false is returned.

5. isDifferentByOne
- I have the correct method definition [Mark out of 5:5]
- Comment: I have the correct method definition 
- My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10:10]
- Comment: My method loops through the length of a words comparing characters at the same position in both words searching for one difference.

6. isWordChain
- I have the correct method definition [Mark out of 5:5]
- Comment: I have the correct method definition
- My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:10]
- Comment: My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message 

7. main
- Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out of 10:10]
- Comment: Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures 
- Asks the user for input and calls isWordChain [Mark out of 5:5]
- Comment: Asks the user for input and calls isWordChain 

 Total Mark out of 100 (Add all the previous marks): 100
 */


import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Scanner;


public class WordLinks {

	public static void main(String[] args) {
		boolean finish = false;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter a list of words separated by commas (,) or press SPACE to quit");
			String wordsEntered = input.nextLine();
			String[] wordList = readWordList(wordsEntered);

			if(wordsEntered.equals(" "))
				finish = true;

			if (isWordChain(wordList)){
				System.out.println("Valid chain of words from Lewis Carroll's word-links game.");
			}
			else {
				System.out.println("Not a valid chain of words from Lewis Carroll's word-links game.");
			}

		} while (!finish);
		input.close();
	}

	public static String[] readWordList(String wordsEntered) {
		return wordsEntered.split(", ");
	}

	public static ArrayList<String> readDictionary() {
		ArrayList<String> dictionary = new ArrayList<String>();
		File file = new File("words.txt");
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (input.hasNextLine()) {
			dictionary.add(input.nextLine().toLowerCase());
		}

		return dictionary;
	}

	public static boolean isUniqueList(String[] wordsEntered){
		for (int i = 0; i < wordsEntered.length; i++) 
			for(int j = i + 1; j < wordsEntered.length - 1; j++)
				if (wordsEntered[i] == wordsEntered[j])
					return false;
		return true;
	}


	public static boolean isEnglishWord(String word) {
		ArrayList<String> dictionary = readDictionary();
		int index = Arrays.binarySearch(dictionary.toArray(), word);
		if (index >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDifferentByOne(String string1, String string2){
		if(string1.length() == string2.length()){
			boolean different =  false;
			for(int i = 0; i < string1.length(); i++){
				if(string1.charAt(i) != string2.charAt(i)) {
					if(different)
						return false;
					else
						different = true;
				}
			}
			return true;
		}
		return false;
	}

	public static boolean isWordChain(String[] wordsEntered) {
		if (!isUniqueList(wordsEntered))
			return false;

		for(int i = 0; i < wordsEntered.length; i++){
			if (!isEnglishWord(wordsEntered[i]))

				return false;
		}

		for(int i = 0; i < (wordsEntered.length - 1); i++) {
			if (!isDifferentByOne(wordsEntered[i], wordsEntered[i+1]))
				return false;
		}

		return true;
	}

}
