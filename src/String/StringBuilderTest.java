package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
//		sb = sb.deleteCharAt(0).insert(0, 'h')." World!";
		
		String[] array = new String[]{"A","B","C"};
		List<String> list1 = Arrays.asList(array);
		List<String> list2 = new ArrayList<>(Arrays.asList(array));
		List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"),"C"));
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
	}

}
