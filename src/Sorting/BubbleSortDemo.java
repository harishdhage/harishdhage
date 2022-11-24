package Sorting;

public class BubbleSortDemo {
    public static void main(String abc[]){

        int elements[] = {7, 8, 1, 4, 2};
        BubbleLogicClass b = new BubbleLogicClass();
        b.logicMeth(elements);
    }
}

class BubbleLogicClass{
    public void logicMeth(int[] elementsToSort){
        int big = 0;

        //Loop to elements
        for (int i = 0; i<elementsToSort.length-1; i++){
            for(int j=0; j<elementsToSort.length-i-1; j++){
                //swap
                if (elementsToSort[j] > elementsToSort[j+1]){
                    int temp = elementsToSort[j];
                    elementsToSort[j] = elementsToSort[j+1];
                    elementsToSort[j+1] = temp;
                }
            }

        }

        System.out.println("Sorted Array");
        for (int x = 0; x<elementsToSort.length; x++){
            System.out.println(elementsToSort[x]);
        }
    }
}
