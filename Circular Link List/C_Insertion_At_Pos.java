package Circular_LinkList;

class Circular_ListC{
    Node last;
    
    public void list() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        last = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = last;
        last.next = first;
    }
    
    public boolean isEmpty() {
        if (last == null) {
            return true;
        }
        return false;
    }
    
    public void display() {
        Node first;
        if (!isEmpty()) {
            if (last.next == null) {
                System.out.println(last.getData());
            } else {
                first = last.next;
                while (first != last) {
                    System.out.print(first.getData() + "-->");
                    first = first.next;
                }
                System.out.print(first.getData()+"\n");
            }
        }
        else
            System.out.println("List is empty.");
    }
    
    public int getSize(){
        int size = 0;
        if(!isEmpty()){
            Node first = last.next;
            while(first != last)
            {
                size++;
                first = first.next;
            }
            size++;
        }
        return size;
    }
    
    public void insertAtBegg(int data){
        System.out.print("Insertion at begg: ");
        Node toAdd = new Node(data);
        if(isEmpty()){
            last = toAdd;
            last.next = toAdd;
        }
        else{
            Node first = last.next;
            toAdd.next = first;
            last.next = toAdd;
        }
    }
    
    public void insertAtEnd(int data){
        System.out.print("Insertion at end: ");
        Node toAdd = new Node(data);
        if(isEmpty()){
            last = toAdd;
            last.next = toAdd;
        }
        else{
            Node first = last.next;
            last.next = toAdd;
            toAdd.next = first;
            last = toAdd;
        }
    }
    
    public void insertAtPos(int pos, int data){
        Node toAdd = new Node(data);
        int size = getSize();
        //System.out.println("size: "+size);
        if(pos<1 || pos>size)
            System.out.println("Insertion is not possible.");
        else if(pos == 1)
            insertAtBegg(data);
        else if(pos == size+1)
            insertAtEnd(data);
        else{
            System.out.print("Insertion at given position: ");
                       
            Node temp = last.next;  // i = 1
            for (int i = 2; i <= pos-2; i++) {
                temp = temp.next;
            }
            Node after = temp.next;
            temp.next = toAdd;
            toAdd.next = after;
        }
    }
    
}
public class C_Insertion_At_Pos {
    public static void main(String[] args) {
        Circular_ListC cll = new Circular_ListC();
        //cll.list();
        cll.display();
        cll.insertAtBegg(10);
        cll.display();
        cll.insertAtBegg(5);
        cll.display();
        cll.insertAtEnd(100);
        cll.display();
        cll.insertAtPos(2, 2);
        cll.display();
        cll.insertAtPos(3, 10);
        cll.display();
    }
}
