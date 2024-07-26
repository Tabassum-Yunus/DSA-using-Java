package Stack;

import java.util.Stack;

public class A_Stack_Using_Collections {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(5);
        stk.push(10);
        System.out.println("Peek: "+stk.peek());
        stk.push(20);
        System.out.println("Size: "+stk.size());
        stk.pop();
        System.out.println("Pop: "+ stk.pop());
        System.out.println("Empty: "+ stk.isEmpty());
    }
}
