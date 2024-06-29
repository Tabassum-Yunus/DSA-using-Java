package LinkList;

class Singly_LLC{
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
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    public int getSize(){
        int size=0;
        if(head == null)
            return 0;
        Node temp = head;
        while(temp != null){
            ++size;
            temp = temp.next;
        }
        return size;
    }
    
    public Node insertAtBegg(int data){
        if(head == null)
        {
            head = new Node(data);
            return head;
        }
        Node toAdd = new Node(data);
        toAdd.next = head;  
        head = toAdd;
        return head;
    }
    
    public Node insertAtEnd(int data){
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node toAdd = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
        return head;
    }
    
    public Node insertAtPos(int data, int pos){
        int size = getSize();
        System.out.println(size);
        if(pos<1 || pos>size+1)
        {
            System.out.print("Insertion is not possible. ");
            return head;
        }
        else if(pos == 1)
        {
            System.out.print("\nInsertion at given position: ");
            head = insertAtBegg(data);
        }    
        else if(pos == size+1){
            System.out.print("\nInsertion at given position: ");
            head = insertAtEnd(data);
        }
        else
        {
            System.out.print("\nInsertion at given position: ");
            Node toAdd = new Node(data);
            Node temp = head;       // bcz i=1 is here
            Node after;
            for (int i = 2; i <= pos-2; i++) {
                temp = temp.next;
            }
            after = temp.next;
            temp.next = toAdd;
            toAdd.next = after;
        }
        return head;
    }
}




public class C_Insertion_At_Pos {

    public static void main(String[] args) {
        Node head;
        Singly_LLC sll = new Singly_LLC();
        sll.list();
        System.out.print("Original LL: ");
        sll.display();
        
        head = sll.insertAtBegg(5);
        System.out.print("\nInsertion at beginning: ");
        sll.display();
        head = sll.insertAtEnd(100);
        System.out.print("\nInsertion at end: ");
        sll.display();
        head = sll.insertAtPos(00, 8);
        sll.display();
    }
}
