package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateClass dc = new DuplicateClass();
		String str = "This program is to test replace the duplicate occurences of word and retain the first occenced word string.";
		dc.findDuplicateNReplace(str, "word");
		System.out.println("/n***********************/n");
		dc.getDuplicateStringCount(str);
	}
	
	
	
}

class DuplicateClass{
	// Method to replace all the required word in string except the first occurance
	protected void findDuplicateNReplace(String inputString, String valueToReplace){
		System.out.println("Before Replace - "+inputString);
		System.out.println("Value to be replaced - "+valueToReplace);
		inputString = inputString.replaceFirst(valueToReplace, "#123#");
		inputString = inputString.replaceAll(valueToReplace, "");
		String replacedString = inputString.replace("#123#", valueToReplace);
		System.out.println("After Replace - "+replacedString);
		
		
	}
	
	void getDuplicateStringCount(String inputString){
		//Below one is to get duplicate word in a string
//		String word[] = inputString.split(" ");
		//Below one to get duplicate character in a string
		String word[] = inputString.split("");
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String currentWord : word){
			
			if(wordCount.containsKey(currentWord)){
				wordCount.put(currentWord, wordCount.get(currentWord)+1);
			}else {
				wordCount.put(currentWord, 1);
			}
		}
		
		Set<String> extractedWord = wordCount.keySet();
		
		for (String w1 : extractedWord) {
			if (wordCount.get(w1)>1) {
				System.out.println("Word - '"+w1+"' occurred - "+wordCount.get(w1));
			}
		}
		
	}
}
