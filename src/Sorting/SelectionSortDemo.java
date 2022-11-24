package Sorting;

public class SelectionSortDemo {

    public static void main(String ab[]){

        int[] elementArray = {87, 56, 97, 86, 21, 29, 21};
        SelectionSortTechnique sst = new SelectionSortTechnique();
        sst.logicMethod(elementArray);
    }
}

//Time complexity = O(n^2)
class SelectionSortTechnique{
    public void logicMethod(int[] elementToSort){
        int smallElement = 0;
        int outer = 0, inner = 0;
        for (int i=0; i<elementToSort.length; i++){
            smallElement = elementToSort[i];
            int temp = smallElement;
            int index = i;
            outer++;
            for (int j=i+1; j<elementToSort.length; j++){
                inner++;
                if (smallElement > elementToSort[j]){
                    smallElement = elementToSort[j];
                    index = j;
                }
            }
            if (smallElement != temp){
                elementToSort[i] = smallElement;
                elementToSort[index] = temp;
            }
        }

        System.out.println("Sorted array");
        for (int x = 0; x<elementToSort.length; x++){
            System.out.print(elementToSort[x]+" ");
        }
        System.out.println("\nTotal outer loop = "+outer);
        System.out.println("Total inner loop = "+inner);
    }

}
