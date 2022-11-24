//All methods one with different parameter and return type makes 'Method Overloading', 
//which is part of 'Polymorphism'

package methodConcept;

class MethodsDefined{
	void one(){
		System.out.println("Method one without Parameter");
	}
	
	void two(){
		System.out.println("Method two without parameter");
	}
	void one(int a){
		System.out.println("int a = "+a);
	}
	void one(int a, int b){
		System.out.println("int a = "+a+", b = "+b);
	}
	void one(int a, double b){
		System.out.println("int a = "+a+", b = "+b);
	}
	float one(float a){
		System.out.println("Float a = "+a);
		return a*a;
	}
	double one(double a){
		System.out.println("Double a = "+a);
		return a*a;
	}
}
public class MethodOverload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float result1;
		double result2;

		MethodsDefined md= new MethodsDefined();
		md.one();
		md.two();
		md.one(10);
		md.one(10, 12);
		md.one(10, 8.12);
		result1=(float) md.one(6.11);
		System.out.println("Float method one result = "+result1);
		result2=md.one(123.11);
		System.out.println("Double method one result = "+result2);
		
	}

}
