package interfaceAndAbstract;

public class DefineInterface implements InterfaceOne, interfaceTwo{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("from Check method");
	}

	@Override
	public void dagar() {
		// TODO Auto-generated method stub
		System.out.println("from Dagar");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		//PI=2.1F; Wont allow to change the value of variable defined in interface, because these are be default final constant
		System.out.println("From display");
		System.out.println("Print PI = "+PI);
	}

	@Override
	public void fromTwo() {
		// TODO Auto-generated method stub
		System.out.println("from interface 2");
		
	}
	
}
