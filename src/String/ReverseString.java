package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringToReverse = "Apple";
		ReverseStrTest rst = new ReverseStrTest();
		rst.reverseStringByToCharArray(stringToReverse);
		rst.reverseStringByCharAt(stringToReverse);
		rst.reverseStringByStringBuffer(stringToReverse);
		rst.reverseStringByStringBuilder(stringToReverse);
	}

}

class ReverseStrTest{
	//toCharArray approach
	public void reverseStringByToCharArray(String inputString){
		
		char[] inputStringArray = inputString.toCharArray();
		String reversedString;
		
		for (int i = inputStringArray.length-1; i >= 0; i--) {
			System.out.print(inputStringArray[i]);
		}
		
	}
	
	//charAt approach
	public void reverseStringByCharAt(String inputString){
		System.out.println("\n***************");
		for (int i = inputString.length()-1; i >= 0; i--) {
			System.out.print(inputString.charAt(i));
		}
	}
	
	//StringBuffer
	void reverseStringByStringBuffer(String inputString){
		System.out.println("\n*****************\nreverseStringByStringBuffer\n");
		StringBuffer inputStringBuffer = new StringBuffer();
		inputStringBuffer.append(inputString);
		System.out.println(inputStringBuffer.reverse());
	}
	
	//StringBuilder
	void reverseStringByStringBuilder(String inputString){
		System.out.println("\n*****************\reverseStringByStringBuilder\n");
		StringBuilder inputStringBuilder = new StringBuilder();
		inputStringBuilder.append(inputString);
		System.out.println(inputStringBuilder.reverse());
	}
}
