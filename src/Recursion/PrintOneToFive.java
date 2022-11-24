package Recursion;

public class PrintOneToFive {
    public static void main(String[] args) {
        OneToFive oneToFive = new OneToFive();
        oneToFive.oneToFivePrint(1);
    }
}

class OneToFive{
    public void oneToFivePrint(int num){
        if (num == 6){
            return;
        }
        System.out.print(num+" ");
        oneToFivePrint(num+1);
    }
}
