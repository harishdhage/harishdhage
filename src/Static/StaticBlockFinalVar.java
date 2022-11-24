package Static;

public class StaticBlockFinalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Test().x);
	}

}

class Test{
	//if final variable is defined, then Test class wont be loaded. directly it will print 100.
	public static final int x = 400;
//	public static  int x = 100;
//	public final int x = 110;
	
	static{
		System.out.println("Static block in  Test class");
	}
}