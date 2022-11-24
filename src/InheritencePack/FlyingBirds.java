package InheritencePack;

public class FlyingBirds extends Animal{
    public static void main(String[] args) {
        FlyingBirds fb = new FlyingBirds();
        fb.birds();
        fb.pigion();

        //Java wont allow to Child class object assigned with Parent
        /*FlyingBirds fb1 = new Animal();
        fb1.birds();
        fb1.pigion();*/

        //Parent class object assigned with Child Class, but it can only have visibility to parent class methods
        Animal a = new FlyingBirds();
        a.birds();
        a.mammals();

        //Same as above
        Animal ab = new Animal();
        ab.mammals();
//        ab.pigion();
    }

    public void pigion(){
        System.out.println("Inside FlyingBirds class method - pigion");
    }
}
