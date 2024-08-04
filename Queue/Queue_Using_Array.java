package Queue;

class Queue{
    private int front = -1;
    private int rear = -1;
    int arr[];
    
    public boolean isEmpty(){
        if(front == -1 && rear == -1)
            return true;
        return false;
    }
    
    public boolean isFull(){
        return arr.length == getSize(); 
    }
    
    public void createQueue(int capacity){
        arr = new int[capacity];
        
    }
    
    public int getSize(){
        return rear+1;
    }
    
    public void enque(int data){
        if(isFull())
            throw new RuntimeException("Queue is full.");
        else{
            if(front == -1)
                front++;
            rear++;
            arr[rear] = data;
        }
    }
    
    public int deque(){
        int data;
        if(isEmpty())
            throw new RuntimeException("Queue is empty.");
        data = arr[front];
        front++; 
        return data;
    }
    
    public void display(){
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("");
    }
}

public class A_Queue_Using_Array {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.createQueue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);  
        q.display();
        System.out.println("Deque operation: "+q.deque());
        q.display();
    }
}
