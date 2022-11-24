package String;

import java.util.Base64;
import java.util.Base64.Encoder;

public class EncodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEncode te = new TestEncode();
		te.encodeStr("CXIAccCust_Clob");
//		te.encodeStr("Apple");
	}
	
	
}
class TestEncode{
	public void encodeStr(String clobeCode){
		String str = "text-QA Test for RESTRequestNoteCAM";
		Encoder encoder = Base64.getEncoder();
//		String originalString = "basic";
		String encodedString = encoder.encodeToString(str.getBytes());
		System.out.println(encodedString);
	}

}
