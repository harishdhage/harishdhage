package Searching;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayEle = {-2,12,13,14,15,16,17,18,19,20};
		BinarySearchClass bsc = new BinarySearchClass();
		bsc.logic1(arrayEle, 13);
		bsc.logic2(arrayEle, 20);
	}

}

class BinarySearchClass{
	public void sort(){
		
	}
	
	public void logic1(int[] arrayEle, int seachableEle){
		 int lower = 0;
		 int higher = arrayEle.length;
		 int count=0;
		 boolean findFlag = false;
		 while (lower < higher) {
			 System.out.println("Iteration - "+count++);
			int mid = (lower+higher)/2;
			if(arrayEle[mid] == seachableEle){
				System.out.println("Element : "+seachableEle+" found at index - "+mid);
				findFlag=true;
				break;
			}
			else if(arrayEle[mid] < seachableEle) {
				lower = mid+1;
				System.out.println("Required element found at RHS");
			}
			else {
				higher = mid-1;
				System.out.println("Required element found at LHS");
			}
			
		}
		 System.out.println("FindFlag = "+findFlag);
	}
	
	public void logic2(int[] arrayEle, int seachableEle){
		System.out.println("Element found at - "+Arrays.binarySearch(arrayEle, seachableEle));
	}
}
