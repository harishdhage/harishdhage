package InheritencePack;

public class SimpleInheritanceTest {

    public static void main(String[] abc){
        Cat cat = new Cat();
        cat.catLocalMethod();
        cat.display();

        Cat cat2 = new Leopard();
        cat2.display();
        cat2.catLocalMethod();

        Leopard leopard1 = new Leopard();
        leopard1.display();
        leopard1.leopardLocalMethod();

        // Extended class reference is not allowed to assign Base class object
//        Leopard leopard2 = new Cat();

    }
}

class Cat{
    public void display(){
        System.out.println("Inside Cat Class");
    }

    public void catLocalMethod(){
        System.out.println("Inside catLocalMethod()");
    }

}

class Leopard extends Cat{
    public void display(){
        System.out.println("Inside Leopard Class");
    }

    public void leopardLocalMethod(){
        System.out.println("Inside leopardLocalMethod()");
    }

}
