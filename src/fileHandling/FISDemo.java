package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FISDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		WorkWithFIS wFIS = new WorkWithFIS();
//		wFIS.readOperation();
		
		int sz;
		InputStream is;
		
			try {
				//D:/Study/Selenium Practices/JavaConcept/src
				is = new FileInputStream("/fileHandling/FISDemo.java");
				sz = is.available();
				System.out.println("Total available Size - "+sz);
				int n = sz/40;
				for (int i = 0; i < n; i++) {
					System.out.println((char) is.read());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
		
	

}

class WorkWithFIS{
	int sz;
	InputStream is;
	public WorkWithFIS() {
		// TODO Auto-generated constructor stub
		try {
			is = new FileInputStream("FISDemo.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readOperation() throws IOException{
		sz = is.available();
		System.out.println("Total available Size - "+sz);
		int n = sz/40;
		for (int i = 0; i < n; i++) {
			System.out.println(is.read());
		}
	}
	
}
