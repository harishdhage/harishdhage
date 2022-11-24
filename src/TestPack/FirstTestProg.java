package TestPack;

public class FirstTestProg {
    public static void main(String[] abc){
        Test t = new Test();
        t.printTEst();
    }
}

class Test{
    public void printTEst(){
        int[] num = {3, 1, 4, 6, 2};
        int[] sorted = new int[5];
        int temp = num[0];
        for(int i = 1; i < num.length; i++){
            if (num[i] > temp){
                sorted[i] = temp;
                temp = num[i];
            } else{
                sorted[i] = num[i];
                temp = num[i];
            }
            System.out.print(sorted[i]+" ");
        }
    }
}
