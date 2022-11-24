package InheritencePack.OverridePack;

public class OverrideDemo {
    public static void main(String[] args) {

        OverrideSubClass osc = new OverrideSubClass();
        osc.print(); //It calls the base class print version
        osc.car();
        osc.fruit();
        osc.getColor();
    }
}

class OverrideTest{
    public final void print(){
        System.out.println("In print() of OverrideTest class");
    }

    public static void fruit(){
        System.out.println("In static fruit() of OverrideTest class");
    }

    private void color(){
        System.out.println("In private color() of OverrideTest class");
    }

    public void getColor(){
        color();
    }

    public void car(){
        System.out.println("In private car() of OverrideTest class");
    }

}

class OverrideSubClass extends OverrideTest{

    //Not allowed to override final methods
    /*public final void print(){
        System.out.println("In print() of OverrideTest class");
    }*/

    //This version of method in not overridden, it's method hiding
//    @Override
    public static void fruit(){
        System.out.println("In static fruit() of OverrideSubClass class");
    }

    private void color(){
        System.out.println("In private color() of OverrideSubClass class");
    }

    public void getColor(){
        color();
    }

    public void car(){
        System.out.println("In private car() of OverrideSubClass class");
    }
}
