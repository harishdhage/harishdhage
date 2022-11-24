package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "Hello Harish";
		
		char[] aa = abc.toCharArray();
		int count=0;
		HashMap<Character, Integer> r = new HashMap<>();
		for (int i = 0; i < aa.length; i++) {
			if (r.containsKey(aa[i])) {
				r.put(aa[i], r.get(aa[i])+1);
			}else {
				r.put(aa[i], 1);
			}
			
		}
		Set<Character> cs = r.keySet();
		for (char c : cs) {
			if (r.get(c)>1) {
				System.out.println(c +" : "+r.get(c));
			}
		}
	}

}


