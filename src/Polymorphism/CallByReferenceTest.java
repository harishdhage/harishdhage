package Polymorphism;

import org.w3c.dom.css.Rect;

public class CallByReferenceTest {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle();
        rt.length = 10.01f;
        System.out.println("Before modifying - "+rt.length);
        volume(rt);
        System.out.println("After modifying - "+rt.length);
        Rectangle rt1 = rt;
        System.out.println("Reference obj - "+rt1.length); // It refers to the value which got updated at line 8
        Rectangle rt2 = new Rectangle();
        System.out.println("New Obj - "+rt2.length);
    }

    public static void volume(Rectangle rta){
        rta.length = 13.11f;

    }
}

class Rectangle{
    float length = 11.02f, breadth;


}
