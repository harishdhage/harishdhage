package InterfaceDemo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal at = new AddTwo();
		AddTwo at = new AddTwo();
		for (int i = 0; i < 5; i++) {
			System.out.println("AddByTwo : "+at.addByTwo());
		}
		at.printMeth();
		at.printMsg();
		Animal.printStat();
		
		System.out.println(Animal.str);
	}

}
