package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr="", reversedStr = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		
		try {
			originalStr = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int originalStrSize = originalStr.length();
		System.out.println("Original String - "+originalStr+"\nSize of original string - "+originalStrSize);
		
		for (int i = originalStrSize-1; i >= 0; i--) {
			reversedStr = reversedStr+originalStr.charAt(i);
		}
		
		//Other ways to reverse
		/*StringBuilder sb = new StringBuilder(originalStr);
		reversedStr = sb.reverse().toString();
		
		StringBuffer sbuf = new StringBuffer(originalStr);
		reversedStr = sbuf.reverse().toString();*/
		
		System.out.println("Reversed String - "+reversedStr);
		if (reversedStr.equals(originalStr)) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is NOT pallindrome");
		}
	}

}
