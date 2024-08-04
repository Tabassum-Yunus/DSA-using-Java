package Queue;

class Node{
    private int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    Node front = null;
    Node rear = null;
    
    public boolean isEmpty(){
        if(front == null && rear == null)
            return true;
        return false;
    }
    
    public void display(){
        if(!isEmpty()){
            Node temp = front;
            System.out.print("Queue: ");
            while(temp != null){
                System.out.print(temp.getData() + "-->");
                temp = temp.next;
            }
            System.out.print("null\n");
        }
        else
            throw new RuntimeException("Queue is empty.");
    }
    
    public void enque(int data){
        Node toAdd = new Node(data);
        if(isEmpty()){
            front = toAdd;
            rear = toAdd;
        }
        else{
            rear.next = toAdd;
            rear = toAdd;
        }
    }
    
    public int deque(){
        if(isEmpty())
            throw new RuntimeException();
        else{
            int data = front.getData();
        front = front.next;
        return data;
        }  
    }
    
}

public class A_Queue_Using_LL {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.display();
        q.deque();
        q.deque();
        q.display();
    }
}
