
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
    
    public int dltAtBegg(){
        Node temp;
        temp = head;
        head = head.next;
        head.prev = null;
        return temp.getData();
    }
    
    public int dltAtEnd(){
        Node temp;
        temp = tail;
        tail = tail.prev;
        tail.next = null;
        return temp.getData();
    }
    
    public void dltAtPos(int pos){
        int size = getSize();
        if(pos<1 || pos>size)
            System.out.println("Deletion is not possible.");
        else{
            System.out.println("    DELETION AT GIVEN POSITION");
            if(pos == 1)
                System.out.println("Deleted data: " + dltAtBegg());
            else if(pos == size)
                System.out.println("Deleted data: " + dltAtEnd());
            else{
                Node temp = head, before, after;
                for (int i = 2; i <= pos-1; i++) {
                    temp = temp.next;
                }
                System.out.println("Deleted data: "+ temp.next.getData());
                before = temp;
                after = temp.next.next;
                before.next = after;
                after.prev = before;
            }
        }       
    }
}

public class D_Deletion_At_Pos {
    public static void main(String[] args) {
        Doublyy_LLC dll = new Doublyy_LLC();
        dll.list();
        dll.fwDisplay();
        dll.bwDisplay();
        
        if(!dll.isEmpty()){
            System.out.println("    DELETION AT BEGG ");
            System.out.println("Deleted key: "+dll.dltAtBegg());
            dll.fwDisplay();
            dll.bwDisplay();
             
            System.out.println("     DELETION AT END ");
            System.out.println("Deleted key: "+dll.dltAtEnd());
            dll.fwDisplay();
            dll.bwDisplay();
            
            dll.dltAtPos(1);
            dll.fwDisplay();
            dll.bwDisplay();
        }
    }
}
