package LinkList;

class Singly_LLJ{
    Node head;
    
    public void list(){
        head = new Node(10);
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(40);
        Node fourth = new Node(60);
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
    
//    public static Node removeDuplicates(Node head){
//        Node prev = head, curr = prev.next;
//        while(curr != null){
//            if(curr.getData() == prev.getData()){
//                curr = curr.next;
//                //System.out.println(curr.getData());
//                prev.next = curr;
//            } 
//            prev = curr;
//            if(curr != null)
//                curr = curr.next;
//        }
//        return head;
//    }
    
    public Node removeDuplicates(){
        Node curr = head;
        while(curr.next != null){
            if(curr.getData() == curr.next.getData())
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}
public class J_Remove_duplicates_SortedLL {
    
    public static void main(String[] args) {
        Node head ;
        Singly_LLJ sll = new Singly_LLJ();
        sll.list();
        sll.display();
        head = sll.removeDuplicates();
        sll.display();
    }
}
