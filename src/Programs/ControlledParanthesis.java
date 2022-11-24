package Programs;

public class ControlledParanthesis {
	
	// like expression should close paranthesis accordingly
	// (a+b)*(d/w)+(x-y)  - Valid
	// )a+b+(c+d-[x+y)]   - Invalid

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParanthesisTest para = new ParanthesisTest();
		para.check();
	}

}

class ParanthesisTest{
	String openParanthesis = "*/%+-";
	void check(){
		String some = "/";
		System.out.println(openParanthesis.contains(some)?true:false);
	}
}
