package Circular_LinkList;

class Circular_ListB{
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
                System.out.print(first.getData());
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
}
public class B_Size_LL {
    public static void main(String[] args) {
        Circular_ListB cll = new Circular_ListB();
        cll.list();
        cll.display();
        System.out.println("\nSize of list: "+cll.getSize());
    }
}
