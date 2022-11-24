package Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=0;
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Enter numbers only!!");
			e.printStackTrace();
		}
		
		ReverseNumberLogic rnl = new ReverseNumberLogic();
		rnl.logic1(num);
		rnl.logic2(num);
	}

}

class ReverseNumberLogic{
	
	public void logic1(int num){
		System.out.println("Before reverse - "+num);
		int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("After reverse - " + reversed);
	}
	
	public void logic2(int num){
		System.out.println("Using String Buffer");
		System.out.println("Before reverse - "+num);
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println("After reverse - "+rev);
		
	}
}
