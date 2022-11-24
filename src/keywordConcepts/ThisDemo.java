package keywordConcepts;

public class ThisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SomeClass sm = new SomeClass();
		sm.display();
		System.out.println("some class = "+sm);
		
		SomeClass sm1 = new SomeClass();
		sm1.no=10;
		sm1.display();
		
		ThisInConstructor thc = new ThisInConstructor(3);
		new ThisInConstructor(11, 3);
		
		ThisInOverloadConctructor oc=new ThisInOverloadConctructor();
		oc.display();
		new ThisInOverloadConctructor(17).display();
		new ThisInOverloadConctructor(12, 22).display();
	}

}

class SomeClass{
	int no = 1;
	public void display(){
		no = 5;
		System.out.println("Before = "+no);
		this.no=no;
		this.no++;
		//when there is local variable same as instance variable, then local variable get more priority
		System.out.println("Local variable = "+no);
		System.out.println("This keword = "+this);
		// here above this keyword is stored memory point of object sm 
		System.out.println("Instance variable = "+this.no);
	}
}

class ThisInConstructor{
	int a;
	float c;
	
	public ThisInConstructor(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
		//Instance variable = Local variable
		System.out.println(this.a);
	}
	
	public ThisInConstructor(int a, float c){
		this.a=a;
		this.c=c;
		System.out.println(this.a+" and "+this.c);
	}
	
}

class ThisInOverloadConctructor{
	int x,y;
	boolean z;
	String str;
	
	public ThisInOverloadConctructor() {
		// TODO Auto-generated constructor stub
		x = 0;
		y = 1;
		z = false;
		str = "Null";
	}
	
	public ThisInOverloadConctructor(int x){
		this.x=x;
		this.y=20;
		this.z= true;
		this.str="Integer";
	}
	
	public ThisInOverloadConctructor(int x, int y){
		this();
//		this(10);  //Not allowed to use multiple this call to constructor
		this.x=x;
		this.y=y;
		this.z= true;
		this.str="x and y";
		
	}
	
	public void display(){
		System.out.println("x = "+x+"| y = "+y+"| z = "+z+"| str ="+str);
	}
}

class TestThis extends ThisInOverloadConctructor{
	/*this(){

	}*/
	public TestThis(){
		super();
//		super(10); //Not allowed to call multiple super constructor
	}
	public void demoA(){


	}
}