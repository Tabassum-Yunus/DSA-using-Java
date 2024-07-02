package LinkList;

class Singly_LLI{
    Node head;
    
    public void list(){
        head = new Node(20);
        Node first = new Node(30);
        Node second = new Node(50);
        Node third = new Node(40);
        Node fourth = new Node(10);
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
    
    public Node sort(){
        Node curr = head;
        while(curr.next != null){
            Node next = curr.next;
            while(next != null){
                if(curr.getData() > next.getData()){
                    Node temp = new Node(curr.getData());
                    curr.setData(next.getData());
                    next.setData(temp.getData());
                }
                next = next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
public class I_Sort_LL {
        
    public static void main(String[] args) {
        Node head = null ;
        Singly_LLI sll = new Singly_LLI();
        sll.list();
        sll.display();
        head = sll.sort();
        sll.display();
    }
}
