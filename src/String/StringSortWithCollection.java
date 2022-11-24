package String;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringSortWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[]{"abc", "21", "0", "10"};
		System.out.println("Before - "+Arrays.toString(arr));
		List<String> list1 = Arrays.asList(arr);
		Collections.sort(list1);
		System.out.println("After - "+Arrays.toString(arr));
	}

}
