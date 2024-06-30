package LinkList;

class Singly_LLE{
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
    
    //    public Node dltKey(int data){
//        Node curr = head;
//        if(head.getData() == data)
//            head = head.next;
//        while(curr.next != null){
//            if(curr.next.getData() == data)
//                curr.next = curr.next.next;
//            else
//                curr = curr.next;
//        }
//        return head;
//    }
    
    public Node dltKey(int key){
        Node curr = head, temp = null;
         if(head.getData() == key)
         {
             head = head.next;
             return head;
         }
        while(curr != null && curr.getData() != key){
            temp = curr;
            curr = curr.next;
        }
        if(curr == null)
            return null;    // key not found
        temp.next = curr.next;
        return head;
    }
    
}



public class E_Deletion_Key {
    
    public static void main(String[] args) {
        Singly_LLE sll = new Singly_LLE();
        sll.list();
        sll.display();
        int key = 10;
        Node head = sll.dltKey(key);
        if(head == null)
            System.out.println("Key not found.");
        else{
            System.out.println("Deletion of key "+key);
            sll.display();
        }       
    }
}
