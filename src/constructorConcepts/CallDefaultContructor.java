package constructorConcepts;

public class CallDefaultContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultContructorCallDemo d = new DefaultContructorCallDemo(11);
		d.displayX();
	}

}

class DefaultContructorCallDemo{
	int x=10;
	public DefaultContructorCallDemo(){
		System.out.println("Inside defualt contructor");
	}
	
	public DefaultContructorCallDemo(int x){
		this();
		this.x = x;
		System.out.println("In parameter Contructor");
	}
	
	void displayX(){
		System.out.println("X - "+x);
	}
}
