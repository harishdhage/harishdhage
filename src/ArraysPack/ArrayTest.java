package ArraysPack;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoolTest bt = new BoolTest(false);
		bt.testFlag();
		bt.lengthTest();
	}

}

class BoolTest{
	boolean f;
	public BoolTest(boolean f) {
		// TODO Auto-generated constructor stub
		this.f = f;
	}
	
	public void testFlag(){
		if(f){
			System.out.println("Flag is true - "+f);
		}else {
			System.out.println("Flag is false - "+f);
		}
	}

	public void lengthTest(){
		String str = "Harish Dhage";
		String strArray[]={"Mon","Tue","Wed","Thu"};
		System.out.println("String length - "+str.length()+" | Array length - "+strArray.length);
	}
}
