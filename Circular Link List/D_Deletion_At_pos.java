package Circular_LinkList;

class Circular_ListD{
    Node last;
    
    public void list() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        last = new Node(6);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = last;
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
    
    public void dltAtBegg(){
        System.out.print("Deletion at begg: ");
        last.next = last.next.next; 
    }
    
    public void dltAtEnd(){
        System.out.print("Deletion at end: ");
        Node temp = last.next;
        while(temp.next != last){
            temp = temp.next;   
        }
        temp.next = temp.next.next;
        last = temp;
    }
    
    public void dltAtPos(int pos){
        int size = getSize();
        //System.out.println("size: "+size);
        if(pos<1 || pos>size)
            System.out.println("Deletion is not possible.");
        else if(pos == 1)
            dltAtBegg();
        else if(pos == size+1)
            dltAtEnd();
        else{
                System.out.print("Deletion at given position: ");
               Node first = last.next;
               for (int i = 2; i < pos-1; i++) {
                   first = first.next;
            }
            first.next = first.next.next;
        }
    }
}

public class D_Deletion_At_pos {
    public static void main(String[] args) {
        Circular_ListD cll = new Circular_ListD();
        cll.list();
        cll.display();
        cll.dltAtBegg();
        cll.display();
        cll.dltAtEnd();
        cll.display();
        cll.dltAtPos(2);
        cll.display();
        cll.dltAtPos(1);
        cll.display();
    }
}
