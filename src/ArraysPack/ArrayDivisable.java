package ArraysPack;

import java.util.Arrays;

public class ArrayDivisable {
    public static void main(String[] abc){
        ArrayDivide ad = new ArrayDivide();
        int[] x = {21, 32, 12, 54, 11, 10};
        ad.test(x);
    }
}

class ArrayDivide{
    public void test(int[] x){
        int sum = Arrays.stream(x).sum();
        System.out.println(">> "+sum);
        int count=0;
        for (int num:x) {
            int reminder = sum%num;
            if (reminder == 0){
                System.out.println("Divides Num - "+num+" | reminder : "+reminder);
                count++;
            }else {
                System.out.println("Not Divides Num - "+num+" | reminder : "+reminder);
            }
        }
        System.out.println("Number of element can divide the sum of array - "+count);
    }
}
