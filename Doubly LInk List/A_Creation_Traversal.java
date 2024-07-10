package Doubly_LinkList;

class Node{
    Node prev;
    private int data;
    Node next;
    
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    
    Node(int data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class Doubly_LL{
    Node head = null;
    Node tail = null;
    
    public boolean isEmpty(){
        if(head == null && tail == null)
            return true;
        return false;
    }
    
//    public void addNode(int data){
//        Node toAdd = new Node(data);
//        if(head == null){
//            head = toAdd;
//            tail = toAdd;
//        }
//        else{
//            tail.next = toAdd;
//            toAdd.prev = tail;
//            tail = toAdd;
//        }
//        System.out.println("Added data: "+ data);
//    }
    
    public void list(){
        head = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        tail = new Node(25);
        head.next = n2;
        
        n2.next = n3;
        n2.prev = head;
        
        n3.next = n4;
        n3.prev = n2;
        
        n4.next = tail;
        n4.prev = n3; 
        
        tail.prev = n4;
    }
    
    public void fwDisplay(){
        Node temp = head;
        System.out.print("Forward Display: ");
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    public void bwDisplay(){
        Node temp = tail;
        System.out.print("\nBackward Display: ");
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.prev;
        }
        System.out.print("null");
    }
}



public class A_Creation_Traversal {
    public static void main(String[] args) {
        Doubly_LL dll = new Doubly_LL();
        System.out.println("List is empty: "+dll.isEmpty());
        dll.list();
        System.out.println("List is empty: "+dll.isEmpty());
        dll.fwDisplay();
        dll.bwDisplay();
    }
}











