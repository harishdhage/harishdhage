package ArraysPack;


public class ArraySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Splitter ss = new Splitter();
		ss.split();

	}

}

class Splitter{
	String sp = "Apple$Orange$Mango$Banana";
	
	public void split(){
		String[] sp3;
		System.out.println("Array length - "+sp.length());
		for (String sp2 : sp.split("$")) {
			System.out.println(sp2);
			//sp3[]=sp2;
		}
	}
}
