package constructorConcepts;


//Program to demonstrate call by value

class Test{
		
	public void meth(int a, int b){
		a*=2;
		b/=2;
		//scope of local variable is limited to inside method only
		System.out.println("View inside meth : "+a+" "+b);
	}
}
public class CallByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		int x = 11, y = 20;
		
		System.out.println("Before call : "+x+" "+y);
		t1.meth(x, y);
		System.out.println("After call by reference : "+x+" "+y);
		t1.meth(15, 20);
		System.out.println("After call by value : "+x+" "+y);
	}

}
