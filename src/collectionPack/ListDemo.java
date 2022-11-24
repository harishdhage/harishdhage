package collectionPack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<>();
		l.add("Apple");
		l.add("Mango");
		l.add("Chikoo");
		l.set(1, "Banana");
		l.add(null);
		l.add("Bread");
		l.remove(0);
		l.add("Chikoo");
		System.out.println("********** List *************");
		System.out.println(l.size()+" || "+l);
		
		System.out.println("******* ArrayList ***********");
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Mango");
		al.add("Chikoo");
		al.add(1, "Banana");
		al.add(null);
		al.add("Bread");
		al.remove(0);
		al.set(1, "Pomogranite");
		al.add("Banana");
		System.out.println(al.size()+" || "+al);
		
		System.out.println("******* LinkedList ***********");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Apple");
		ll.add("Mango");
		ll.add("Chikoo");
		ll.add(1, "Banana");
		ll.add(null);
		ll.add("Bread");
		ll.remove(0);
		ll.set(1, "Pomogranite");
		ll.add("Banana");
		System.out.println(ll.size()+" || "+ll);
	}

}
