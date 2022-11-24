package String;

public class ReplaceReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDifference fd = new FindDifference();
		fd.replaceDemo("Eat Apple !!");
		fd.replaceAllDemo("Eat Apple !!");
	}

}

class FindDifference{
	void replaceDemo(String inputString ){
		System.out.println(inputString.replace('A', 'M'));
	}
	
	void replaceAllDemo(String inputString){
		System.out.println(inputString.replaceAll("Apple", "Mapple"));
	}
}
