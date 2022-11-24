package Sorting;

public class MergeSortTechnique {
    public static void main(String[] args) {

        int[] inputArrayToSort = {22, 54, 10, 37, 14, 42};
        MergeSort mergeSort = new MergeSort();
        int[] sortedArray = mergeSort.divideArray(inputArrayToSort, 0, inputArrayToSort.length-1);
        mergeSort.printArray(sortedArray);

    }
}

class MergeSort{

    public int[] divideArray(int[] inputArray, int si, int ei){
        if (si >= ei){
            return null;
        }
        int mi = si+ (ei-si) / 2;
        divideArray(inputArray, si, mi);
        divideArray(inputArray, mi+1, ei);
        return conquireArray(inputArray, si, mi, ei);
    }

    private int[] conquireArray(int[] dividedArray, int si, int mi, int ei){
        int[] merger = new int[ei - si +1];
        int idx1 = si;
        int idx2 = mi+1;
        int x = 0;

        while (idx1 <= mi && idx2 <= ei){
            if (dividedArray[idx1] <= dividedArray[idx2]){
                merger[x] = dividedArray[idx1];
                x++;idx1++;
            }else {
                merger[x++] = dividedArray[idx2++];

            }
        }

        while (idx1 <= mi){
            merger[x++] = dividedArray[idx1++];
        }

        while (idx2 <= ei){
            merger[x++] = dividedArray[idx2++];
        }

        for (int i=0, j=si; i < merger.length; i++, j++){
            dividedArray[j] = merger[i];
        }
        return dividedArray;
    }

    public void printArray(int[] inputArray){
        System.out.println("Sorted Array as - ");
        for (int i = 0; i < inputArray.length; i++){
            System.out.print(inputArray[i]+" ");
        }
    }
}
