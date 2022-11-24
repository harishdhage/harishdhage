package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter A Year");
		 int year=0;
		try {
			year = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //Century year divisible by 400
		 if(year%100==0 && year%400==0)
		 System.out.println("it is leap year A");
		 else if(year%100!=0 && year%4==0)
		 System.out.println("it is leap year B");
		 else
		 System.out.println("it is not leap year");
	}

}
