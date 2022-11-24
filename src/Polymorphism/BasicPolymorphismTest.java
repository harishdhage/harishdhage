package Polymorphism;

public class BasicPolymorphismTest {
    public static void main(String[] args) {
        PolymorphismClass pc = new PolymorphismClass();
        //Both method name are same but java invokes right method on basis of number of parameter.
        //So method acts according to the situation
        //It is a compile time polymorphism
        //This concept is is called Method Overloading
        pc.add(10,11);
        pc.add(10,11,12);
        main();
    }

    //main() method can also be overloaded
    public static void main(){
        System.out.println("main method of overloaded version");
    }

}

class PolymorphismClass{
    public void add(int a, int b){
        System.out.println("Inside add method with 2 parameter");
        int sum = a+b;
        System.out.println("Added value = "+sum);
    }
    public void add(int a, int b, int c){
        System.out.println("Inside add method with 3 parameter");
        int sum = a+b+c;
        System.out.println("Added value = "+sum);
    }
    /*public void add(int a, int b,...){

    }*/
}