package Encapsulation;

public class EncapsulationWithGetterSetter {
    public static void main(String[] args) {

        User u = new User();
        u.setFirstName("Tom");
        u.setLastName("Hank");
        System.out.println("Getter value - "+u.getFullName());
    }
}
