package LinkList;

class Node{
    private int data;
    Node next;
    
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Singly_LL{
    Node head;
    Node tail;
    
    public void list(){
        head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node tail = new Node(50);
        
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = tail;
    }
    
    public void addNode(int data){
        Node toAdd = new Node(data);
        
        if(head == null){
            head = toAdd;
            tail = toAdd;
        }
        else{
            tail.next = toAdd;
            tail = toAdd;
        }
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

public class A_Creation_Traversal {
    
    public static void main(String[] args) {
        Singly_LL sll = new Singly_LL();
        //sll.list();
        sll.addNode(10);
        sll.addNode(20);
        sll.addNode(30);
        sll.addNode(50);
        sll.display();
    }
}
