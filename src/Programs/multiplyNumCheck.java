package Programs;

import java.util.Arrays;

public class multiplyNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 123321;//142857;
	        int mul = 2;
	        int ans = (number * mul);

	        // int 285714

	        String s1 = String.valueOf(number);
	        String s2 = String.valueOf(ans);

	        System.out.println(s1 + " , " + s2);

	        char ch1[] = s1.toCharArray();
	        char ch2[] = s2.toCharArray();
	        String sort1 = "";
	        String sort2 = "";

	        Arrays.sort(ch1);

	        for (char i : ch1) {
	            sort1 = sort1 + i;
	        }

	        Arrays.sort(ch2);

	        for (char i : ch2) {
	            sort2 = sort2 + i;
	        }

	        System.out.println(sort1 + " " + sort2);

	        if(sort1.equals(sort2))
	            System.out.println("Mirrored!!");
	        else
	            System.out.println("Wrong!!");
	    
	}


	
	
	public static void multiplyNum(){
		int sixDigNum = 123456, multipleNum = 2, numX;
		numX = sixDigNum * multipleNum;
		System.out.println("NumX - "+numX);
	}

}
