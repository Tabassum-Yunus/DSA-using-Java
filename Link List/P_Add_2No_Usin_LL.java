package LinkList;

import java.util.Scanner;

public class P_Add_2No_Usin_LL {
    
    public static Node list(int num){
        int r = num%10;
        num /= 10;
        Node head = new Node(r), tail = head, toAdd;
        while(num > 0){
            r = num%10;
            toAdd = new Node(r);
            tail.next = toAdd;
            tail = tail.next;
            num /=10;
            }
        return head;
    }
    
    public static Node display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+ "-->");
            temp = temp.next;
        }
        System.out.println("null");
        return head;
    }
        
    public static Node add(Node a, Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry =0;
        while(a != null || b != null){
            int x = (a != null) ? a.getData() : 0;
            int y = (b != null) ? b.getData() : 0;
            int sum = carry+x+y;
            carry = sum/ 10;
            tail.next = new Node(sum%10);
            tail = tail.next;
            if(a!= null)
                a = a.next;
            if(b != null)
                b = b.next;
        }
        if(carry >0)
            tail.next = new Node(carry);
        return dummy.next;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node headA = list(n1);
        Node headB = list(n2);
        Node sum = add(headA, headB);
        display(headA);
        display(headB);
        display(sum);
    }
}
