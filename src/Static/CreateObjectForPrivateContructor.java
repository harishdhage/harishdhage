package Static;

public class CreateObjectForPrivateContructor {
	// How can we create objects if we make the constructor private ? 

		
	public static void main(String[] args) {
		//Here creating object throws error, cant visible private methods
//		PrivateConstructorClass pc = new PrivateConstructorClass();
//		System.out.println(c.age);
		
		int x = PrivateConstructorClass.objectCreator();
		System.out.println("Age - "+ x);
	}
}


class PrivateConstructorClass{
	int age;
	private PrivateConstructorClass(){
		age = 33;
	}

	//static block will get highest priority to get executed
	static{
		PrivateConstructorClass pc = new PrivateConstructorClass();
		System.out.println("In static block - "+pc.age);
	}

	//after static block this meth will executes
	public static int objectCreator(){
		PrivateConstructorClass pc = new PrivateConstructorClass();
		System.out.println("In objectCreator() - "+pc.age);
		pc.age = 11;
		return pc.age;
	}
}