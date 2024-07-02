package LinkList;

class Singly_LLK {

    Node head;

    public void list() {
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public Node insert(int data) {
        Node curr = head, prev = null, toAdd = new Node(data);
        if (curr.getData() > data) {
            toAdd.next = curr;
            head = toAdd;
        }
        while (curr != null && data > curr.getData()) {
            if (data < curr.next.getData()) {
                prev.next = toAdd;
                toAdd.next = curr;
            }
            prev = curr;
            curr = curr.next;
            
            if (curr.next == null) {
                curr.next = toAdd;
                toAdd.next = null;
            }
        }
        return head;
    }

}

public class K_Insertion_Key_Sorted_LL {

    public static void main(String[] args) {
        Node head;
        Singly_LLK sll = new Singly_LLK();
        sll.list();
        sll.display();

        head = sll.insert(5);
        sll.display();
        head = sll.insert(35);
        sll.display();
        head = sll.insert(65);
        sll.display();
    }
}
