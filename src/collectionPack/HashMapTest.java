package collectionPack;

import java.util.Collection;
import java.util.HashMap;


public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Apple", 3);
		hm.put("Mango", 12);
		int countApple = hm.get("Apple");
		hm.put("Apple", countApple+4);
		System.out.println(hm.get("Apple"));
	}

}
