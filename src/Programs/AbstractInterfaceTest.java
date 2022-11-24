package Programs;

public class AbstractInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtendedClass ec = new ExtendedClass();
		
		ec.loan();
		ec.nonAbstractBankMethod();
		ec.fund();
		ec.gasolineState();
		ec.liquidState();
		ec.solidState();
		
		AbstractBank ab = new ExtendedClass();
		ab.loan();
		ab.nonAbstractBankMethod();
		//ab.fund();   - Not allowed here as child class method wont visible to parent class
	}

}

 //Abstract class defination
abstract class AbstractBank{
	public abstract void loan();   //absttract method
	int x = 10;
//	public abstract void interest();
	public void nonAbstractBankMethod(){
		System.out.println("nonAbstractBankMethod..!");
	}
}


interface InterfaceClass{
	public void solidState();
	public void liquidState();
	public default void gasolineState(){
		System.out.println("Defined method");
	}
//	public void mixerState();
	int value = 100;
}

class ExtendedClass extends AbstractBank implements InterfaceClass{

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Defined loan() inside exctedClass");
	}
	
	public void fund(){
		x = x+10;
		System.out.println("var val - "+x);
		System.out.println("fund() inside exctedClass");
	}

	@Override
	public void solidState() {
		// TODO Auto-generated method stub
		System.out.println("Defined solidState() inside exctedClass");
	}

	@Override
	public void liquidState() {
		// TODO Auto-generated method stub
//		int reCalc = value++; - Not allowed to change the variable value
		System.out.println("Value  - "+value);
		System.out.println("Defined liquidState() inside exctedClass");
	}
	
	
}