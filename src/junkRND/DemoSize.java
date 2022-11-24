package junkRND;

import java.util.ArrayList;
import java.util.List;

public class DemoSize {
    public static void main(String[] args) {

    }
}

class MyClass {


    public void printSize(){
        int x = 10;
        int xArr[] = {1, 2, 3, 4};
        String str = "Apple";
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(21);
        li.add(3);

//        System.out.println("Size of int - "+x.);
        System.out.println("Size of int - "+xArr.length);
        System.out.println("Size of int - "+str.length());
        System.out.println("Size of int - "+li.size());

    }
}


