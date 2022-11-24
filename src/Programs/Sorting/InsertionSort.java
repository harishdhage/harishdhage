package Programs.Sorting;

import java.awt.RenderingHints.Key;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {89, 31,88, 90, 65, 12};
		InsertionTest it = new InsertionTest();
		it.sortLogic(x);

	}

}


class InsertionTest{
	public int[] sortLogic(int[] inputArray){
		
		System.out.println("Before Sort - "+Arrays.toString(inputArray));
		int key;
		for (int i = 1; i < inputArray.length; i++) {
			key = inputArray[i];
			int j = i;
			while (j > 0 && inputArray[j-1] > inputArray[j]) {
				int temp = inputArray[j];
				inputArray[j] = inputArray[j-1];
				inputArray[j-1] = temp;
				j--;
			}
		}
		System.out.println("After Sort -  "+Arrays.toString(inputArray));
		return inputArray;
	}
}