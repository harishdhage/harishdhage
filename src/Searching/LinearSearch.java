package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayEle = {12,33,14,11,6,97,8,19,12};//{12,32,11,54,24,35};
		int count=0;
		for (int i : arrayEle) {
			System.out.println("index - "+count++);
			if (i==11) {
				System.out.println("Element found");
				break;
			}
		}
	}

}
