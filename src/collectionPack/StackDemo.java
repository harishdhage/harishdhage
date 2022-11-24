package collectionPack;

import java.util.Stack;
import java.util.Vector;

//Stack is a sub-class for Vector, hence we can use all the Vector features
//It uses the LIFO method with data
public class StackDemo {
    public static void main(String[] anc){
        StackTest st = new StackTest();
        st.checkStack();
    }
}

class StackTest{
    protected void checkStack(){
        Stack<Integer> s = new Stack<>();
        System.out.println("Stack is empty : "+s.empty());
        s.push(21);
        s.push(32);
        s.push(11);
        s.push(16);
        System.out.println("Capacity before pop - "+s.capacity());
        s.pop();
        s.peek();
        System.out.println("Capacity after pop - "+s.capacity());
        for (int a:s ) {
            System.out.printf(" "+a);
        }

    }
}
