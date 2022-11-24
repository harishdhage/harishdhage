package String;

public class StringEqual {

    public static void main(String[] args) {
        StringCheck sc = new StringCheck();
        sc.checkEquals("Apple", "apple");
        String x = "Mango";
        String y = new String("Mango");
        sc.checkEquals(x,y);
    }

}

class StringCheck{
    public void checkEquals(String str1, String str2){
        boolean matchFlag = str1.equals(str2);
        System.out.println("Match Flag - "+matchFlag);
    }
    //Equal cannot be used for string
    /*private void checkEqual(String str1, String str2){
        boolean matchFlag = str1.equal(str2);
        System.out.println("Match Flag - "+matchFlag);
    }*/
}
