package InterfaceDemo;

public interface Animal {
	
	String str=" Just static+final string";
	
	int addByTwo();
	
	default void printMsg(){
		System.out.println("Functional interface");
	}
	
	static void printStat(){
		System.out.println("Inside static interface method");
	}
	
	default void anotherPrint(){
//		privateMethod();
		System.out.println("Functional interface - anotherPrint()");
	}
	
	//Private method can be defined which was introduced from Java-9
	/*private void privateMethod() {
		System.out.println("private Method");
	}*/

}
