package ArraysPack;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10, 20, 30, 40};
		int[] b = {10, 20, 31, 40};
		ArrayCompareLogic acl = new ArrayCompareLogic();
		acl.logic1(a, b);
		acl.logic2(a, b);
	}

}

class
ArrayCompareLogic{
	public void logic1(int[] a, int[] b){
		System.out.println("2 Arrays are equals - "+Arrays.equals(a, b));
	}
	
	public void logic2(int[] a, int[] b){
		boolean matchFlag=false;
		if (a.length==b.length) {
			for (int i = 0; i < b.length-1; i++) {
				if (a[i] == b[i]) {
					matchFlag=true;
				}else {
					matchFlag=false;
					break;
				}
			}
		}
		else {
			matchFlag = false;
		}
		System.out.println("2 Arrays are equal? - "+matchFlag);
	}
	
	
}
