package Tree;

class Tree1{
    Node root;
    
    public Node createTree(){
        root = new Node(10);
        
        root.left = new Node(20);      // 20<--10-->30                          //           10
        root.right = new Node(30);                                              //      20          30
                                                                                    //  40          60       70 
        root.left.left = new Node(40);   // 40<-- 20                            //                    80
                                                                                    
        root.right.left = new Node(60);   // 60 <-- 30 --> 70                   
        root.right.right = new Node(70);                                
        
        root.right.right.left = new Node(80);   // 80 <-- 70
        
        return root;
    }
    
    public int height(Node root){
        int h;
        if(root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        if(lheight > rheight)
            return lheight+1;
        else
            return rheight+1;
    }
}

public class B_Height_of_Tree {
    public static void main(String[] args) {
        Tree1 t = new Tree1();
        Node root = t.createTree();
        System.out.println("Height: "+t.height(root));
    }
}
