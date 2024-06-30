package LinkList;

class Singly_LLD{
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
        System.out.print("null");
    }
    
    public int getSize(){
        int size = 0;
        Node temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }
    
    public Node dltAtBegg(){
        if(head==null)
        {
            System.out.println("Link list is empty");
            return null;
        }
        System.out.println("Deleted data: " + head.getData());
        head = head.next;
        return head;
    }
    
    public Node dltAtEnd(){
        if(head==null)
            System.out.println("Link list is empty");
        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        System.out.println("Deleted data: " + temp.next.getData());
        temp.next = null;
        return head;
    }
    
    public Node dltAtPos(int pos){
        int size = getSize();
        if (pos<1 || pos>size) {
            System.out.println("Deletion is not possible");
            return head;
        }
        else if(pos == 1)
            head = dltAtBegg();
        else if(pos == size)
            head = dltAtEnd();
        else
        {
            int count =1;
            Node temp = head;
            while(count < pos-1){
                count++;
                temp = temp.next;
            }
            System.out.println("Deleted data: " + temp.next.getData());
            temp.next = temp.next.next;
        }
        return head;
    }
}


public class D_Deletion_At_Pos {
       
    public static void main(String[] args) {
        Node head;
        Singly_LLD sll = new Singly_LLD();
        sll.list();
        System.out.print("List: ");
        sll.display();
        System.out.print("\nDeletion at begg: ");
        head = sll.dltAtBegg();
        sll.display();
        System.out.print("\nDeletion at end: ");
        head = sll.dltAtEnd();
        sll.display();
        int pos = 2;
        System.out.print("\nDeletion at position "+pos+ " : ");
        head = sll.dltAtPos(pos);
        sll.display();
    }
}
