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
    
    public int searchFromBegg(int index){
        Node temp = head;
        int count=0;
        while(temp != null){
            count++;
            if(count == index)
                return temp.getData();
            temp = temp.next;
        }
        return -1;
    }
    
    
//    public static int searchFromEnd(Node head, int index){
//        int size = getSize(head);
//        index = size - index + 1;
//        int data = searchFromBegg(head, index);
//        return data;
//    }
    
    public int searchFromEnd(int index){
        int size = getSize();
        if(index<1 || index>size)
            return -1;
        Node mainPtr = head; 
        Node refPtr = head;
        int count = 1;
        while(count <= index){
           refPtr = refPtr.next;
           count++;
        }       
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr.getData();
    }
}
public class G_Search_Node_Using_Index {
    
    public static void main(String[] args) {
        Singly_LLG sll = new Singly_LLG();
        sll.list();
        sll.display();
        
        int data = sll.searchFromBegg(1);
        if(data == -1)
            System.out.println("Index is not valid.");
        else 
            System.out.println("Data from begg: "+ data);
        
        data = sll.searchFromEnd(4);
        if(data == -1)
            System.out.println("Index is not valid.");
        else 
            System.out.println("Data from end: "+ data);
    }
}
