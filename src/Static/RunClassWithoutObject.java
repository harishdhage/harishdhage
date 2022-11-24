package Static;

public class RunClassWithoutObject {
	
	//How can we run a java program without making any object?
	//Similarity and Difference between static block and static method ?
	
	static{
		System.out.println("Static block");
	}
	
	private static void test(){
		System.out.println("static method");
	}
	
	private static void cover(){
		System.out.println("static cover");
		test();
	}
	
	private void nonStatic(){
		System.out.println("nonStatic method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method");
		test();
		cover();
//		nonStatic();  we cant call primitive method without class object
		RunClassWithoutObject r = new RunClassWithoutObject();
		r.nonStatic();
		
	}

}
