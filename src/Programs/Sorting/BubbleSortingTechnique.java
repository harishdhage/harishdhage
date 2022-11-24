package Programs.Sorting;

import java.util.Arrays;

public class BubbleSortingTechnique {
    public static void main(String[] args) {
        BubbleSortTest bst = new BubbleSortTest();
        int arrayToSort[] = {98, 89, 16, 29, 99, 21};
        
        bst.sortLogic(arrayToSort);
    }
}

class BubbleSortTest{
    public void sortLogic(int[] numberArray){
        /*for (int i=0; i < numberArray.length; i++){
            System.out.println("Iteration - "+i);
            for (int j=1; j < numberArray.length - 1; j++){
                if (numberArray[j-1] > numberArray[j]){
                    int temp = numberArray[j-1];
                    numberArray[j-1] = numberArray[j];
                    numberArray[j]=temp;
                }
            }

        }*/
    	System.out.println("Array before sort - "+Arrays.toString(numberArray));
        int n = numberArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numberArray[j-1] > numberArray[j]){
                    //swap elements
                    temp = numberArray[j-1];
                    numberArray[j-1] = numberArray[j];
                    numberArray[j] = temp;
                }

            }
        }
        System.out.println("Array after sort -  "+Arrays.toString(numberArray));
        

    }
}
