package LinkList;

class Singly_LLF{
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
    
    public int getSize(){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    
    public int getMiddle(){
        int size = getSize();
        System.out.println("size: "+size);
        Node temp = head;
        int mid;
        if(size%2 == 0)
            mid = size/2 +1;            
        else
            mid = (size+1)/2;
        System.out.println("Mid: "+mid);
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }
    
}





public class F_Middle_Node {

    public static void main(String[] args) {
        Singly_LLF sll = new Singly_LLF();
        sll.list();
        sll.display();
        int mid = sll.getMiddle();
        System.out.println("Middle node: " + mid);
        
    }
}
