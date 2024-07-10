
package Doubly_LinkList;

class Doublyy_LLC{
    Node head;
    Node tail;
    
    public void list(){
        head = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        tail = new Node(25);
        head.next = n2;
        
        n2.next = n3;
        n2.prev = head;
        
        n3.next = n4;
        n3.prev = n2;
        
        n4.next = tail;
        n4.prev = n3; 
        
        tail.prev = n4;
    }
    
    public boolean isEmpty(){
        if(head == null && tail == null)
            return true;
        return false;
    }
    
    public void fwDisplay(){
        Node temp = head;
        System.out.print("Forward Display: ");
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    
    public void bwDisplay(){
        Node temp = tail;
        System.out.print("Backward Display: ");
        while(temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.prev;
        }
        System.out.print("null\n");
    }
    
    public int getSize(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public void insertAtBegg(int data){
        Node toAdd = new Node(data);
        head.prev = toAdd;
        toAdd.next = head;
        head = toAdd;
    }
    
    public void insertAtEnd(int data){
        Node toAdd = new Node(data);
        tail.next = toAdd;
        toAdd.prev = tail;
        tail = toAdd;
    }
    
    public void insertAtPos(int pos, int data){
        Node toAdd = new Node(data);
        int size = getSize();
        //System.out.println("size: "+size);
        if(pos<1 || pos>size+1)
            System.out.println("Insertion is not possible. ");
        else{
            System.out.println("    INSERTION AT GIVEN POSITION ");
            if(pos==1)
                insertAtBegg(data);
            if(pos == size+1)
                insertAtEnd(data);
            else{
                Node before, after, temp=head;
                for(int i=2; i<=pos-1; i++){
                    temp = temp.next;
                }
                before = temp;
                after = before.next;
                before.next = toAdd;
                toAdd.prev = before;
                toAdd.next = after;
                after.prev = toAdd;
            }
        }   
    }
}
public class C_Insertion_At_Pos {
    public static void main(String[] args) {
        Doublyy_LLC dll = new Doublyy_LLC();
        dll.list();
        dll.fwDisplay();
        dll.bwDisplay();
        
        if(!dll.isEmpty()){
            dll.insertAtBegg(-5);
            System.out.println("      INSERTION AT BEGG: ");
            dll.fwDisplay();
            dll.bwDisplay();
             
            dll.insertAtEnd(-10);
            System.out.println("    INSERTION AT END ");
            dll.fwDisplay();
            dll.bwDisplay();
            
            dll.insertAtPos(7, 100);
            dll.fwDisplay();
            dll.bwDisplay();
        }
    }
}

