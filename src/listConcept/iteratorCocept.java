package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratorCocept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final List<String> list = new ArrayList<String>();
//		list = new LinkedList<>();  // when we use final for list, then we cant change it's object type but we can manupulate data
		list.add("QTP");
		list.add("Selenium");
		list.add("JMeter");
		list.remove(2);
		
		//System.out.println(list.get(2));
		
		/*for(String element:list){
			System.out.println(element);
		}*/
			
		for(Iterator<String>iterator=list.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		list.add("Apple");

	}

}
