package loopCencept;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        CaseTest ct = new CaseTest();
        ct.testSwitch("Mondaya");
    }
}

class CaseTest{
    public void testSwitch(String day){
        switch (day){
            case "Sunday":
                System.out.println("Its Sunday");
                break;
            case "Monday":
                System.out.println("Its boring Monday");
                break;
//            default:
//                System.out.println("Invalid input");
        }


    }
}
