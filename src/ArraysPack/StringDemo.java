package ArraysPack;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstNonRepeat fnr = new FirstNonRepeat();
fnr.nonRepeat();
	}

}

class FirstNonRepeat{
	public void nonRepeat(){
		String str = "applea";
		char[] cc = str.toCharArray();
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println("Non repeat :: "+c);
				break;
			}
			System.out.println("Loop :: "+c);
			/*for (int i = 0; i < cc.length; i++) {
				System.out.println("Loop :: "+i);
				if (cc[i] == c) {
					System.out.println("cc : "+cc[i]+" | c : "+c);
				}
			}*/
		}
		/*for (int i = 0; i < cc.length; i++) {
			System.out.println("Loop :: "+i);
			if (cc[i] == cc[i+1]) {
				System.out.println("cc : "+cc[i]+" | cc[i+1] : "+cc[i+1]);
			}
		}*/
	}
}
