package LinkList;


class Singly_LLN{
    Node head;
    
    public void list(){
        head = new Node(1);
        Node first = new Node(2);
        Node sec = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);
        Node tail = new Node(6);
        head.next = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = tail;
        tail.next = sec;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+ "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    public Node detectLoop(){
        Node fast = head, slow = head;
        System.out.println("detectLoop method");
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return startOfLoop(slow);   
        }
        return null;
    }
    
    public Node startOfLoop(Node slow){
        Node temp = head, prev = null;
        while(temp != slow){
            prev = slow;
            slow = slow.next;
            temp = temp.next;
        }
        return prev;
    }
    
    public Node removeLoop(){
        Node prev = detectLoop();
        prev.next = null;
        return head;
    } 
}
public class N_Remove_Loop {
    
    public static void main(String[] args) {
        Node head;
        Singly_LLN sll = new Singly_LLN();
        sll.list();
        //display(head);
        Node start = sll.detectLoop();
        if(start != null){
            System.out.println("Link list contains loop and its start is: "+start.next.getData());
            head = sll.removeLoop();
            sll.display();
        }
        else
            System.out.println("Link list doesn't contains loop");
        
    }
    
}

