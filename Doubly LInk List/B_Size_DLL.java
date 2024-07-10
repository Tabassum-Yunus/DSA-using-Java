
package Doubly_LinkList;

class Doubly_LLB{
    Node head;
    Node tail;
    
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
    
    public boolean isEmpty(){
        if(head == null && tail == null)
            return true;
        return false;
    }
    
    public int getSize(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class B_Size_DLL {
    public static void main(String[] args) {
        Doubly_LLB dll = new Doubly_LLB();
        dll.list();
        if(!dll.isEmpty()){
            int size = dll.getSize();
            System.out.println("Size of Doubly ll: " + size);
        }        
    }
}
