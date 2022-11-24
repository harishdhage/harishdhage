package collectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTest llt = new LinkedListTest();
		llt.assignSubString();
		llt.printByIterator();
	}

}

class LinkedListTest{
	LinkedList<String> colorList = new LinkedList<String>();
	List<String> colorSubList;
	List<String> colorSubList2;
	public LinkedListTest() {
		// TODO Auto-generated constructor stub
		colorList.add("White");
		colorList.add("Red");
		colorList.add("Orange");
		colorList.add("Black");
		colorList.add("RedOrange");
		colorList.add(null);
		colorList.add("Black");
		System.out.println("Size of colorList before insert at index - "+colorList.size());
		colorList.add(2, "Blue");
		System.out.println("Size of colorList after insert at index - "+colorList.size());
		System.out.println("Linked list - "+colorList);
	}
	
	void assignSubString(){
		colorSubList = new ArrayList<String>(colorList.subList(1, 3));
		colorSubList2 = new ArrayList<String>(colorList.subList(3, 3));	
	}
	
	void getSubString(){
		System.out.println("Sub str 1 - "+colorSubList);
		System.out.println("Sub str 2 - "+colorSubList2);
	}
	
	void printByIterator(){
		System.out.println("========Inside Iterator=======");
		Iterator<String> itr = colorList.iterator();
		System.out.println("Iterator obj - "+itr);
		while (itr.hasNext()) {
			System.out.println("Iterator obj - "+itr.next());
			
		}
	}
	
	void changeToArray(){
		Object[] colorArray = colorList.toArray();
		for (Object object : colorArray) {
			System.out.println("Color Aarray - "+object);
		}
		
	}
}

