package Stack;

import java.util.EmptyStackException;

class Stack{
    private int top = -1;
    private int[] arr;

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
    
    public void createStack(int capacity){
        arr = new int[capacity];
    }
    
    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }
    
    public int size(){
        return top+1;
    }
    
    public boolean isFull(){
        return arr.length == size();
    }
    
    public void push(int data){
        if(isFull())
            throw new RuntimeException("Stack is full.");
        else
            arr[++top] = data;
    }
    
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty.");
        int data = arr[top];
        top--;
        return data;
    }
    
    public int peek(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty.");
        return arr[top];
    }
    
    public void display(){
        if(isEmpty())
           throw new RuntimeException("Stack is empty.");
        System.out.print("Stack: ");
        while(top != -1)
        {
            System.out.print( arr[top]+"  ");
            top--;
        }
    }
}

public class A_Stack_Using_Array {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.createStack(5);
        System.out.println("isEmpty: "+ stk.isEmpty());
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
//        stk.push(6);
        System.out.println("Pop: "+stk.pop());
        System.out.println("Peek: "+ stk.peek());
        stk.display();
    }
}
