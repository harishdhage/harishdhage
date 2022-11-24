package Programs;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumLogic snl = new SwapNumLogic();
		snl.logic1(10, 20);
		snl.logic2(10, 20);
		snl.logic3(10, 20);
	}

}

class SwapNumLogic{
	//swap without temp
	public void logic1(int num1, int num2){
		System.out.println("Swap without temp");
		System.out.println("Before swap num1 - "+num1+" | num2 - "+num2);
		num1=num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After swap num1 - "+num1+" | num2 - "+num2);
	}
	
	public void logic2(int num1, int num2){
		System.out.println("Swap without temp by using * and /");
		System.out.println("Before swap num1 - "+num1+" | num2 - "+num2);
		num1=num1*num2;
		num2 = num1/num2;
		num1 = num1/num2;
		System.out.println("After swap num1 - "+num1+" | num2 - "+num2);
	}
	
	public void logic3(int num1, int num2){
		System.out.println("Swap in single line expression");
		System.out.println("Before swap num1 - "+num1+" | num2 - "+num2);
		num2=num1+num2-(num1=num2);
		System.out.println("After swap num1 - "+num1+" | num2 - "+num2);
	}
}
