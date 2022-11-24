package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapClass hmc = new HashMapClass();
		hmc.getData();
		TreeMapClass tmc = new TreeMapClass();
		tmc.getData();
	}

}

//Duplicate values and Duplicate key were not allowed
//Null value were allowed
//Sorts on basis of key
//null as key allowed
class HashMapClass{
	HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
	public HashMapClass(){
		System.out.println("----------------HashMap------------------");
		hm.put(1, "Mango");
		hm.put(1, "Japan");
		hm.put(2, "Mango");
		hm.put(3, "");
		hm.put(4, "Banana");
		hm.put(5, "Apple");
		hm.put(0, "Zero");
		hm.put(null, "Null Key");
	}
	
	public void getData(){
		System.out.println("Size of HashMap - "+hm.size());
		for (Map.Entry et:hm.entrySet()) {
			System.out.println(et.getKey()+" | "+et.getValue());
		}
	}
}

//Duplicate values and Duplicate key were not allowed
//Null value were allowed
//Sorts on basis of key
//null as key is not allowed
class TreeMapClass{
	TreeMap<Integer, String> hm = new TreeMap<Integer, String>(); 
	public TreeMapClass(){
		System.out.println("----------------TreeMap------------------");
		hm.put(1, "Mango");
		hm.put(1, "Japan");
		hm.put(2, "Mango");
		hm.put(3, "");
		hm.put(4, "Banana");
		hm.put(5, "Apple");
		hm.put(0, "Zero");
//		hm.put(null, "Null Key");  //Null not allowed
	}
	
	public void getData(){
		System.out.println("Size of HashMap - "+hm.size());
		for (Map.Entry et:hm.entrySet()) {
			System.out.println(et.getKey()+" | "+et.getValue());
		}
	}
}