package ArraysPack;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        A a = new A();
        a.x();
    }
}


class A{
    public void x(){
        int[] x = {10, 4, 54, 23, 86,1};
        int[] y = {3, 65, 23, 2, 8, 11};
        int[] z = new int[x.length+y.length];
        int ind = x.length;

        for(int i = 0; i<x.length; i++){
            z[i] = x[i];
        }
        for(int j=0; j<y.length; j++){
            z[ind] = y[j];
            ind++;
        }

        Arrays.sort(z);
        System.out.println("Sorted array \n");
        for(int a: z){
            System.out.print(a+" ");
        }
    }

}
