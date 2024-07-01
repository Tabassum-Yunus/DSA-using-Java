package LinkList;

class Singly_LLG{
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
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }
    
    public int searchFromBegg(int data){
        int pos=-1, index = 0;
        Node temp = head;
        while(temp != null){
            index++;
            if(temp.getData() == data)
            {
                pos = index;
                return pos;
            }   
            temp = temp.next;
        }
        return pos;
    }
    
    public int searchFromEnd(int data){
        int pos = -1, size = getSize();
        pos = searchFromBegg(data);
        return size-pos+1;
    }
}
public class G_Search_Node_Using_Data {
    
    public static void main(String[] args) {
        Singly_LLG sll = new Singly_LLG();
        sll.list();
        sll.display();
        int pos = sll.searchFromBegg(60);
        if(pos == -1)
            System.out.println("Node is not found.");
        else
            System.out.println("Node is found at pos " + pos+" from beginning");
        
        pos = sll.searchFromEnd(10);
        if(pos == -1)
            System.out.println("Node is not found.");
        else
            System.out.println("Node is found at pos " + pos +" from the end");
    }
}
