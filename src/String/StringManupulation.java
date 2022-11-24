package String;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTestClass stc = new StringTestClass();
		stc.checkContains("Luke: Hughes ", "Luke: Hughes");
		stc.regixTest("Confirmation|Process 97816 was submitted.|OK");
//		stc.stringSplit("Status|Active");
		stc.stringSplit("LeadAttachment_CXI_09832dshj");
		stc.stringWithSpecialChar("\\#{sessionScope.zpmAnalyticsPartnerId}");
		String partyId = "300100183005195";
		stc.occurenceOfChar("This is a issue", "s", 3);
		stc.compareVsEquals("Rajini", "Rajini Kanth");
	}

}

class StringTestClass{
	
	public void checkContains(String str1, String str2){
		if (str1.contains(str2)) {
			System.out.println("str1.contains(str2) - Passed");
		} else {
			System.out.println("str2.contains(str1) - Passed");
		}
	}
	
	public void regixTest(String reqString){
		System.out.println("String before remove method - "+reqString);
		System.out.println("String after remove special char operation - "+reqString.replaceAll("[-+^|.]*", ""));
		System.out.println("String after remove special char and alpabet operation - "+reqString.replaceAll("[A-Za-z-+^|.]",""));
		String anv = " 12 3 ";
		System.out.println("Before trim - "+anv.length());
		System.out.println("After trim - "+anv.trim().length());
	}
	
	public void stringSplit(String str){
//		String stra[] = str.split("\\|");
		String stra[] = str.split("_CXI");
		System.out.println(">> "+stra[0]);
	}
	public void stringWithSpecialChar(String str){
		System.out.println("Req str - "+str);
	}
	
	private void replaceSubString(String reqStr){
		int size = reqStr.length()-2;
		String changedStr = reqStr.substring(size, size);
	}
	
	void occurenceOfChar(String inputString, String reqChar, int occerenceCount){
		System.out.println("1St occurence - "+inputString.indexOf(reqChar));
		System.out.println("2nd occurence - "+inputString.indexOf(reqChar, inputString.indexOf(reqChar)+1));
		int incex = inputString.indexOf(reqChar, inputString.indexOf(reqChar)+1);
		System.out.println("3rd occurence - "+inputString.indexOf(reqChar, incex+1));
		
	}
	
	void compareVsEquals(String str1, String str2){
		System.out.println("CompareTo() - "+str1.compareTo(str2));
		System.out.println("equals() - "+str1.equals(str2));
		System.out.println("== "+str1==str2);
	}
}
