package loopConcept;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForLoopTest flt = new ForLoopTest();
		flt.test();
		flt.test2();
	}

}

class ForLoopTest{
	int count = 5;
	public void test(){
		//char a = '*';
		
		for(int i=0; i<count; i++){
			for(int j=0; j<=i; j++){
				System.out.print('*');
				//break;
			}
			System.out.println();
			
		}
	}
	
	public void test2(){
		System.out.println();
		System.out.println("==================================");
		System.out.println();
		for(int i=5; i>=0; i--){
			for(int j=0; j<=i; j++){
				System.out.print('*');
				//break;
			}
			System.out.println();
			
		}
	}
	
	public void test3(){
		System.out.println();
		System.out.println("==================================");
		System.out.println();
		// method to demonstrate the below pattern
		//   *  
		//  **
		//	***
		// ****
		
		for(int i=5; i>=0; i++){
			//for(int j=)
		}
	}
}
