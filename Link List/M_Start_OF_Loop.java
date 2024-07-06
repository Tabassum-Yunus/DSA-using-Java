package LinkList;

class Singly_LLM{
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
    
    public Node display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+ "-->");
            temp = temp.next;
        }
        System.out.println("");
        return head;
    }
    
    public Node detectLoop(){
        Node fast = head, slow = head;
        System.out.println("detectLoop method");
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return startOfLoop( slow);   
        }
        return null;
    }
    
    public Node startOfLoop(Node slow){
        Node temp = head;
        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
}



public class M_Start_OF_Loop {
   
    public static void main(String[] args) {
        Node head;
        Singly_LLM sll = new Singly_LLM();
        sll.list();
        //display(head);
        Node start = sll.detectLoop();
        if(start != null)
            System.out.println("Link list contains loop and its start is: "+start.getData());
        else
            System.out.println("Link list doesn't contains loop");
        
    }
}
