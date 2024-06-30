package LinkList;


class Singly_LLF{
    Node head;
    
    public void list(){
        head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node tail = new Node(60);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = tail;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    
    public int getMiddle(){
        Node fast = head, slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null)
            return slow.next.getData();
        else
            return slow.getData();
    }
}



public class F_MiddleNode_Slow_Fast_Ptr {
    
    public static void main(String[] args) {
        Singly_LLF sll = new Singly_LLF();
        sll.list();
        sll.display();
        int mid = sll.getMiddle();
        System.out.println("Middle node: " + mid);
    }
}
