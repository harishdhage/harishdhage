package Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num,n1,n2=0,n3=1;
		 num=in.nextInt();
		 for(int i=1;i<=num;i++)
		 {
		 System.out.print(" "+n3+" ");
		 n1 = n2;
		 n2 = n3;
		 n3 = n1 + n2;
		 }
	}

}
