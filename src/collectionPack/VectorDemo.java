package collectionPack;

import java.util.List;
import java.util.Vector;

//Vector is a Dynamic Array which implements List interface
//Vector is  Thread-Safe hence it is Synchronized.
//Vector increases the size by 100%
public class VectorDemo {
    public static void main(String[] anc){
        VectorTest vt = new VectorTest();
        vt.demoVector();
    }
}

class VectorTest{
    void  demoVector(){
        Vector<Integer> v = new Vector<>();
        v.add(21);
        v.add(32);
        v.add(2);
        v.add(2);
        v.add(54);
        v.add(32);
        v.add(43);
        v.remove(2);
        System.out.println("Capacity : "+v.capacity());
    }
}