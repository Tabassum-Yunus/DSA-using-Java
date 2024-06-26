package LinkList;

class Singly_LLB{
    Node head;
    
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
    
    public int getSize(){
        int size=0;
        if(head == null)
            return 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}

public class B_Size_LL {
    
    public static void main(String[] args) {
        Singly_LLB sll = new Singly_LLB();
        sll.list();
        int size = sll.getSize();
        System.out.println("Size of LL: " + size);
    }
}
