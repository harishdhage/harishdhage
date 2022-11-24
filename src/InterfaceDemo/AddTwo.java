package InterfaceDemo;

public class AddTwo implements Animal{

	int x;
	
	public AddTwo() {
		x=0;
	}
	
	public int addByTwo() {
		x+=2;
		return x;
	}
	
	public void printMeth(){
//		str = "Update";
		System.out.println("Inside printMeth()");
	}

}
