package collectionPack;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		long startTimeAL= System.nanoTime(); 
		arrayList.get(500000);
		long endTimeAL= System.nanoTime();
		long startTimeLL= System.nanoTime();
		linkedList.get(500000);
		long endTimeLL= System.nanoTime();
		long totalTimeAL = endTimeAL - startTimeAL;
		long totalTimeLL = endTimeLL - startTimeLL;
		System.out.println("Array list get perfromance - "+totalTimeAL);
		System.out.println("\nLinked list get perfromance - "+totalTimeLL);
		System.out.println("**************************************");
		startTimeAL= System.nanoTime(); 
		arrayList.remove(500000);
		endTimeAL= System.nanoTime();
		startTimeLL= System.nanoTime();
		linkedList.remove(500000);
		endTimeLL= System.nanoTime();
		totalTimeAL = endTimeAL - startTimeAL;
		totalTimeLL = endTimeLL - startTimeLL;
		System.out.println("Array list remove perfromance - "+totalTimeAL);
		System.out.println("\nLinked list remove perfromance - "+totalTimeLL);
		System.out.println("**************************************");
		startTimeAL= System.nanoTime(); 
		arrayList.remove(1);
		endTimeAL= System.nanoTime();
		startTimeLL= System.nanoTime();
		linkedList.remove(1);
		endTimeLL= System.nanoTime();
		totalTimeAL = endTimeAL - startTimeAL;
		totalTimeLL = endTimeLL - startTimeLL;
		System.out.println("Array list remove 1st index perfromance - "+totalTimeAL);
		System.out.println("\nLinked list remove 1st index perfromance - "+totalTimeLL);

	}

}
