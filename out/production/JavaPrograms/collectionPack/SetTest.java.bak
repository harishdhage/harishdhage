package collectionPack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
//		set.add(null);
		set.add("Apple");
		set.add("April");
		set.remove(2);
		System.out.println("******** Set ************");
		System.out.println(set.size()+" || "+set);
		System.out.println("");
		System.out.println("********** SortedSet **********");
		SortedSet<String> ss = new TreeSet<>();
		ss.addAll(set);
//		ss.add(null); Null is not allowed
		ss.add("Apple");
		
		System.out.println(ss.size()+" || "+ss);
		System.out.println("********** HashSet **********");
		HashSet<String> hs = new HashSet<>();
		hs.addAll(set);
		hs.add("Apple");
		hs.add(null);
		hs.remove(1);
		System.out.println(hs.size()+" || "+hs);
		
		System.out.println("********** LinkedHashSet **********");
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(set);
		lhs.add("Apple");
		lhs.add(null);
		lhs.remove(1);
		System.out.println(lhs.size()+" || "+lhs);
		
		System.out.println("********** TreeSet **********");
		TreeSet<String> ts = new TreeSet<>();
		ts.addAll(set);
		ts.add("Apple");
//		ts.add(null);
		ts.remove("Apple");
		ts.add("Mapple");
		System.out.println(ts.size()+" || "+ts);
		
	}

}
