package Polymorphism;

public class OverloadingWithInheritence {
    public static void main(String[] args) {
        //Here we are achieving overloaded method from parent to child child class
        //Its a compile time polymorphism
        Fourwheeler fo = new Fourwheeler();
        fo.engineType();
        fo.vehicleOwnsMethod();
    }
}
