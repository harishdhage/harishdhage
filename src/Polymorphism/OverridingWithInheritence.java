package Polymorphism;

public class OverridingWithInheritence {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Twowheeler tw = new Twowheeler();
        System.out.print("1. ");
        tw.vehicleOwnsMethod(); // calls method from Vehicle class
        System.out.print("2. ");
        tw.engineType(); //calls method from Twowheeler class
        System.out.print("3. ");
        v.engineType(); //calls method from Vehicle class
        //Here parent class object referred to child class object, concept is known as Run Time Polymorphism
        //Here case is call-by-referrance or dynamic method dispatch/polymorphism
        v = tw;
        System.out.print("4. ");
        v.engineType();  //child
        System.out.print("5. ");
        v.vehicleOwnsMethod(); //parent

        //Not allowed to refer the parent
//        tw = v;
    }
}
