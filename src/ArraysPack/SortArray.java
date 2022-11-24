package ArraysPack;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] unsortedArray = {4, 1, 55, 12, 63, 55, -4};
		ArraySort as = new ArraySort();
		as.sortArray(unsortedArray);
		as.findSecHighest(unsortedArray);
	}

}

class ArraySort{
	public void sortArray(int[] array){
		Arrays.sort(array);
		int len = array.length;
		for (int i : array) {
			System.out.print(" "+i);
		}
		
		System.out.println("\nSecount highest - "+array[len-2]);
		
	}
	
	public void findSecHighest(int[] array){
		int len = array.length;
		int high =0;
		int secHigh=0;
		System.out.println("Before - "+ array);
		for (int i = 0; i < len; i++) {
			if (array[i] > high) {
				secHigh = high;
				high = array[i];
			}
			
			
		}
		System.out.println("Highest "+high);
		System.out.println("2nd Highest "+secHigh);
	}
}
