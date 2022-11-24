package ArraysPack;

import java.util.Arrays;

//Given a number, write a program to find a maximum number that can be formed using all the digits of this number.
public class MakeLargeNum {
    // Function to generate largest
    // possible number with given digits
    static int findMaxNum(int arr[], int n) {
        // sort the given array in
        // ascending order and then
        // traverse into descending
        Arrays.sort(arr);


        int num = 0;//arr[0];

        // generate the number
        for (int i = n - 1; i >= 0; i--) {
            num = num * 10 + arr[i];
        }

        return num;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 1};

        int n = arr.length;

        System.out.println(findMaxNum(arr, n));
    }

}
