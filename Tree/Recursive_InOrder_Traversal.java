package Tree;

class TreeER{
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
    
    public void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.getData()+"  ");
        inOrder(root.right);
        
    }
}
public class E_Recursive_InOrder_Traversal {
    public static void main(String[] args) {
        TreeER t = new TreeER();
        Node root = t.createTreee();
        t.inOrder(root);
    }
}
