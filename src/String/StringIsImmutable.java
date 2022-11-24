package String;

public class StringIsImmutable {
    public static void main(String[] args) {

        String str = "Harish";
        str.concat("Dhage");
        System.out.println(str);

        Integer i = 10;
        i++;
        System.out.println("Immutable integer - "+i);

    }
}
