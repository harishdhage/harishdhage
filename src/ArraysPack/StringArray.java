package arrayConcept;

import javax.sound.midi.MidiDevice.Info;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallArray ca = new CallArray();
		ca.checkArry();

	}

}

class CallArray{
	String arr[] = {"One","Two","Three","Four"};
	public void checkArry(){
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Iteration - "+i);
			if (arr[i].equals("One")) {
				System.out.println("One found in index : "+i);
			}
			else if (arr[i].equals("Two")) {
				System.out.println("Two found in index : "+i);
			}
			else if (arr[i].equals("Three")) {
				System.out.println("Three found in index : "+i);
			}
			else if (arr[i].equalsIgnoreCase("Four")) {
				System.out.println("Four found in index : "+i);
			}
			else{
				System.out.println("Not found");
			}
			
		}
	}
}
