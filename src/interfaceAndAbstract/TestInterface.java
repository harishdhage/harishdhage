package interfaceAndAbstract;

public class TestInterface extends DefineInterface{

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub

		//InterfaceOne intOne = new InterfaceOne(); Should not allow to create object and constructor for interface
		
		DefineInterface def1 = new DefineInterface();
		def1.check();
		def1.dagar();
		def1.display();
		def1.fromTwo();
	}

}
