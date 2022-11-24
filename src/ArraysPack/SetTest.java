package ArraysPack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Null allowed but duplicate not allowed
//Follows the insertions order
class LinkedHashSetClass{
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	public LinkedHashSetClass(){
		System.out.println("--------------LinkedHashSet------------------");
		lhs.add("Mapple");
		lhs.add("Apple");
		lhs.add("Apple");
		lhs.add("");
		lhs.add("Mango");
		lhs.add("Banana");
	}
	
	public void getData(){
		System.out.println("Size of LinkedHashSet - "+lhs.size());
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}

//Duplicate values were not allowed, but allows null
//Follows the sorted order
class TreeSetClass{
	TreeSet<String> lhs = new TreeSet<String>();
	public TreeSetClass(){
		System.out.println("--------------TreeSet------------------");
		lhs.add("Mapple");
		lhs.add("Apple");
		lhs.add("Apple");
		lhs.add("");
		lhs.add("Mango");
		lhs.add("Banana");
	}
	
	public void getData(){
		System.out.println("Size of TreeSet - "+lhs.size());
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}

//Duplicate values were not allowed, but allows null
//Follows the Hash Code order
class HashSetClass{
	HashSet<String> lhs = new HashSet<String>();
	public HashSetClass(){
		System.out.println("--------------HashSet------------------");
		lhs.add("Mapple");
		lhs.add("Apple");
		lhs.add("Apple");
		lhs.add("");
		lhs.add("Mango");
		lhs.add("Banana");
	}
	
	public void getData(){
		System.out.println("Size of HashSet - "+lhs.size());
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
