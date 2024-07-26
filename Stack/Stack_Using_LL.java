package Stack;

import java.util.EmptyStackException;

class Node{
    private int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class Stack{
    Node top = null;
    
    public boolean isEmpty(){
        if(top == null)
            return true;
        return false;
    }
    
    public int getSize(){
        int size = 0;
        Node temp = top;
        while(temp !=null){
            size++;
        }
        return size;
    }
    
    public void display(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.getData()+ "  ");
            temp = temp.next;
        }
    }
    
    public void push(int data){
        Node toAdd = new Node(data);
        if(isEmpty())
            top = toAdd;
        else{
            toAdd.next = top;
            top = toAdd;
        }
    }
    
    public int pop(){
        int data;
        if(isEmpty())
            throw new EmptyStackException();
        else{
            data = top.getData();
            top = top.next;
        }
        return data;
    }
    
    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        else 
            return top.getData();
    }
}

public class A_Stack_Using_LL {
    public static void main(String[] args) {
        Stack stk = new Stack();
        System.out.println("isEmpty: "+stk.isEmpty());
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println("Pop: "+stk.pop());
        System.out.println("Peek: "+ stk.peek());
        System.out.print("Stack: ");
        stk.display();
    }
}
