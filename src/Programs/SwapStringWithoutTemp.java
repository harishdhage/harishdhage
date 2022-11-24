package Programs;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Happy", str2 = "City";
		
		System.out.println("-----Before swap----");
		System.out.println("str1 - "+str1+"\nstr2 - "+str2);
		
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("-----After swap----");
		System.out.println("str1 - "+str1+"\nstr2 - "+str2);
	}

}
