package OtherGenericProgs;

// Program to sum of digits number
public class SumOfDigits {
    public static void main(String[] a){

        AddAllDigits aad = new AddAllDigits();
        aad.addDigitDemo(1294);
    }
}

class AddAllDigits{
    protected void addDigitDemo(int num){

        int updatedNum = num, sumOfDigit = 0;
        do {
            sumOfDigit = sumOfDigit + updatedNum%10;
            updatedNum = updatedNum/10;
//        System.out.println(updatedNum);
        }while (updatedNum > 0);

        if (sumOfDigit>9){
            addDigitDemo(sumOfDigit);
        }
        System.out.println("Sum of Digits is - "+sumOfDigit);
    }
}