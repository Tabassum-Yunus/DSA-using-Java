package Circular_LinkList;

class Node {

    private int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
    }
}

class Circular_List {

    Node last;

    public void list() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        last = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = last;
        last.next = first;
    }

    public void addNode(int data) {
        Node first;
        Node toAdd = new Node(data);
        if (isEmpty()) {
            last = toAdd;
            toAdd.next = last;
        } else {
            toAdd.next = last.next;
            last.next = toAdd;
            last = toAdd;
        }

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
                System.out.print(first.getData());
            }
        }
        else
            System.out.println("List is empty.");
    }

}

public class A_Creation_Traversal {

    public static void main(String[] args) {
        Circular_List cll = new Circular_List();
        //cll.list();
        cll.addNode(10);
        cll.addNode(20);
        cll.addNode(30);
        cll.display();
    }
}
