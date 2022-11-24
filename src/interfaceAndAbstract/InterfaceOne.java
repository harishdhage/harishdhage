package interfaceAndAbstract;

public interface InterfaceOne {

	//int x;      variable by default defined as final, so it should be initilized
	float PI=3.14F;
	public void display();
	abstract public void dagar(); 
	//private void access();   visibility should be public or default
	void check();
}
