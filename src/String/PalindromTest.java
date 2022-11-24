package String;

import java.io.BufferedReader;

public class PalindromTest {
    public static void main(String[] args) {
        PalindromDemo pd = new PalindromDemo();
        pd.methodImplement("Gadag");
    }
}

class PalindromDemo{
    public void methodImplement(String inputString){
        StringBuilder sb = new StringBuilder();
        sb.append(inputString);
        String reveredStr = sb.reverse().toString();
        if (reveredStr.equalsIgnoreCase(inputString)){
            System.out.println("Provided String - "+inputString+" is palindrome");
        }else {
            System.out.println("Provided String - "+inputString+" is not palindrome");
        }

    }
}
