package collectionPack;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTestCopy mtc = new MapTestCopy();
		mtc.returnMap();
		mtc.hashMapDemo();
		mtc.treeMapDemo();
		mtc.linkedHashMapDemo();
		mtc.identityHashMapDemo();
	}

}

class MapTestCopy{
	Map<String, String> mapTestA = new HashMap<String, String>();
	public void returnMap(){
		mapTestA.put("Apple", "AppleOne");
		mapTestA.put("Orange", "OrangeOne");
		Map<String, String> vehicleMap = new HashMap<String, String>();
		vehicleMap.put("Tata", "Nano");
		vehicleMap.put("Marithi", "Swift");
		mapTestA.putAll(vehicleMap);
		System.out.println("Full Size : "+mapTestA.size());
	}
	
	public void hashMapDemo(){
		System.out.println("********* HashMapDemo ***********");
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("Johny Sin", 12000.21);
		hm.put("Alletta Ocean", 2000.42);
		hm.put("Lacy Heart", 11980.32);
		hm.put("Sunny Leone", 4309.54);
		hm.put(null, null);
		hm.put(new String("Lacy Heart"), 21.32);
		Set set = hm.entrySet();
		iteratorMap(set);
		
	}
	
	public void treeMapDemo(){
		System.out.println("********* TreeMapDemo ***********");
		TreeMap<String, Double> tm = new TreeMap<>();
		tm.put("Johny Sin", 12000.21);
		tm.put("Alletta Ocean", 2000.42);
		tm.put("Lacy Heart", 11980.32);
		tm.put("Sunny Leone", 4309.54);
		tm.put(new String("Lacy Heart"), 21.32);
//		tm.put(null, null);
		Set set = tm.entrySet();
		iteratorMap(set);
		
	}
	
	public void linkedHashMapDemo(){
		System.out.println("********* LinkedHashMapDemo ***********");
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();
		lhm.put("Johny Sin", 12000.21);
		lhm.put("Alletta Ocean", 2000.42);
		lhm.put("Lacy Heart", 11980.32);
		lhm.put("Sunny Leone", 4309.54);
		lhm.put(new String("Lacy Heart"), 21.32);
//		lhm.put(null, null);
		Set set = lhm.entrySet();
		iteratorMap(set);
		
	}
	
	public void identityHashMapDemo(){
		System.out.println("********* IdentityHashMapDemo ***********");
		IdentityHashMap<String, Double> ldhm = new IdentityHashMap<>();
		ldhm.put("Johny Sin", 12000.21);
		ldhm.put("Alletta Ocean", 2000.42);
		ldhm.put("Lacy Heart", 11980.32);
		ldhm.put("Sunny Leone", 4309.54);
		ldhm.put("Sunny Leone", 1001.54);
		ldhm.put(null, null);
		ldhm.put(new String("Lacy Heart"), 21.32); // Accepts duplicate key, as it compared object reference by ==
		Set set = ldhm.entrySet();
		iteratorMap(set);
		
	}
	
	private void iteratorMap(Set set){
		Iterator i = set.iterator();
		System.out.println("Key : Value");
		while (i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}

