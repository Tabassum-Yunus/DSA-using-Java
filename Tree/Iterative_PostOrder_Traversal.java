package Tree;

class TreeFI{
    Node root;
    
    public Node createTreee(){
        root = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(60);
        Node fifth = new Node(70);
        Node sixth = new Node(80);
        Node seven = new Node(50);
                
                
        root.left = first;
        root.right = second;
        first.left = third;
        first.right = seven;
        second.left = fourth;
        second.right = fifth;
        fifth.left = sixth;
        return root;
    }
    
}
public class F_Iterative_PostOrder_Traversal {
    
}
