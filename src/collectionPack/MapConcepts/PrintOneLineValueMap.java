package Collections.MapConcepts;

import java.util.HashMap;
import java.util.Map;

public class PrintOneLineValueMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EpamMapTest e = new EpamMapTest();
		e.testMap();
	}

}

class EpamMapTest{
	void testMap(){
		Map<Integer, String> mapVar = new HashMap<>();
		mapVar.put(1, "One");
		mapVar.put(2, "Two");
		for (Map.Entry m:mapVar.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\n***********************\n");
		
	}
	
	
}
