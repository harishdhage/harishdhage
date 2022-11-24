//Program to demonstrate call by referance
package constructorConcepts;

public class CallByReferance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t2 = new Test1(15,20);
		System.out.println("Before call : "+t2.a+" "+t2.b);
		t2.call(t2);
		System.out.println("After call : "+t2.a+" "+t2.b);
	}

}

class Test1{
	int a,b;
	
	public Test1(int i, int j){
		this.a=i;
		b=j;
	}
	
	public void call(Test1 t2){
		a*=2;
		b/=2;
	}
}