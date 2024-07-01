package LinkList;

import java.util.Stack;

class Singly_LLH{
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
    
    public Node usingArray(){
        int size = getSize();
        int[] arr = new int[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            arr[i] = temp.getData();
            temp = temp.next;
        }
        temp=head;
        for (int i = size-1; i >=0 ; i--) {
           temp.setData(arr[i]);
//           System.out.println(temp.getData());
           temp = temp.next;    
        }
        return head;
    }
    
    public Node usingStack(){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp != null){
            st.push(temp.getData());
            temp = temp.next;
        }
        
        temp = head;
        while(!st.isEmpty()){
            temp.setData(st.pop());
            temp = temp.next;
        }
        return head;
    }
    
    public Node usingPtrs(){
        Node prev = null;
        Node first = head;
        Node sec = first.next;
        while(first != null){
            first.next = prev;
            prev = first;
            first = sec;
            sec = sec.next;
        }
        
        return head;
    }
}

public class H_Reverse_LL {
        
    public static void main(String[] args) {
        Node head;
        Singly_LLH sll = new Singly_LLH();
        sll.list();
        System.out.print("List: ");
        sll.display();
        
        System.out.print("Reverse using array: ");
        head = sll.usingArray();
        sll.display();
        
        System.out.print("Reverse using stack: ");
        head = sll.usingStack();
        sll.display();
        
        System.out.print("Reverse using pointers: ");
        head = sll.usingStack();
        sll.display();
    }
}
