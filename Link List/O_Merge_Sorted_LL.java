package LinkList;

public class O_Merge_Sorted_LL {
    
    public static Node listA(){
        Node head = new Node(3);
        Node first = new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);
        Node tail = new Node(40);
        head.next = first;
        first.next = sec;
        sec.next = third;
        third.next = tail;
        return head;
    }
    
    public static Node listB(){
        Node head = new Node(5);
        Node first = new Node(22);
        Node sec = new Node(25);
        Node third = new Node(35);
        Node fourth = new Node(45);
        Node tail = new Node(50);
        head.next = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = tail;
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

    public static Node merge(Node headA, Node headB){
        Node merged = new Node(0);
        Node tail = merged;
        while(headA != null && headB != null){
            if(headA.getData() < headB.getData()){
                tail.next = headA;
                headA = headA.next;
            }
            else{
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        if(headA == null)
            tail.next = headB;
        else
            tail.next = headA;
        return merged.next;
    }
    
    public static void main(String[] args) {
        Node headA = listA();
        Node headB = listB();
        display(headA);
        display(headB);
        Node merged = merge(headA, headB);
        display(merged);
    }
}
