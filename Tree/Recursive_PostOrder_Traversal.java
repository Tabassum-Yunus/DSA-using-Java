package Tree;

class TreeFR{
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
    
    public void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.getData()+"  ");
    }
}

public class F_Recursive_PostOrder_Traversal {
    public static void main(String[] args) {
        TreeFR t = new TreeFR();
        Node root = t.createTreee();
        t.postOrder(root);
    }
}
