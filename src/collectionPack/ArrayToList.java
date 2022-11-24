package collectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Boolean> listA = new ArrayList<Boolean>();
		listA.add(true);
		listA.add(Boolean.parseBoolean("False"));
		listA.add(Boolean.TRUE);
		System.out.println(listA.size());
		System.out.println(listA.get(1) instanceof Boolean);
		
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList("Apple","banana","Alpenso","Bidi"));
//		wordList = wordList.str
		System.out.println("********************************************");
		
		try {
			System.out.print("Hello World");
		} catch(ArithmeticException e){
			System.out.println("e");
		}catch(Exception e){
			System.out.println("e");
		}
			finally {
		
			System.out.print("!");
			// TODO: handle finally clause
		}
	}

}
