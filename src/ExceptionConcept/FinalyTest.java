package ExceptionConcept;

import java.util.ArrayList;
import java.util.List;

public class FinalyTest {

	public void finalize(){System.out.println("finalize called");}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int x = 10;
		
		try{
//			x++;
			List<String> list = new ArrayList<String>();
			System.out.println(">> "+list.get(0));
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("In Catch");
		}
		finally {
			System.out.println("In Finally");
		}

	}

}

