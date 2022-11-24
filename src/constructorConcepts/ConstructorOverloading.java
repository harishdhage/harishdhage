//This program defines the constructor overloading
//Overloading rule is same for constructor for too

package constructorConcepts;

class Box{
	double length, width, height;
	
	Box(){
		System.out.println("Box constructor without Parameter");
		width=height=length=-1;
	}
	
	Box(double w, double h, double l){
		width = w;
		height = h;
		length = l;
	}
	
	double volume(){
		return width*length*height;
	}
}
public class ConstructorOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result;
		Box b1=new Box();
		Box b2 = new Box(10, 12, 13);
		
		result = b1.volume();
		System.out.println("volume of constructor Box() = "+result);
		result = b2.volume();
		System.out.println("volume of constructor Box(double w, double h, double l) = "+result);
	}

}
