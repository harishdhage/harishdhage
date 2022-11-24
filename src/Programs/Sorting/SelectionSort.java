package Programs.Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] x = {21,43,12,76,43,65};
		SectionSortTest sst = new SectionSortTest();
		sst.sortTechnique(x);

	}

}

class SectionSortTest{
	public void sortTechnique(int numberArray[]){
    	System.out.println("Array before sort - "+Arrays.toString(numberArray));
        for(int i=0; i < numberArray.length-1; i++){
        	int mainIndex = i;
            for(int j=i+1; j < numberArray.length; j++){
                if(numberArray[j] < numberArray[mainIndex]){
                    mainIndex = j;
                }
                

            }
          //swap elements
            int temp = numberArray[i];
            numberArray[i] = numberArray[mainIndex];
            numberArray[mainIndex] = temp;
        }
        System.out.println("Array after sort -  "+Arrays.toString(numberArray));
        
	}
}
