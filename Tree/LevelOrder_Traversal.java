package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Tree2{
    Node root;
    
    public void createTree(){
        root = new Node(10);
        
        root.left = new Node(20);      // 20<--10-->30
        root.right = new Node(30);
        
        root.left.left = new Node(40);   // 40<-- 20
        
        root.right.left = new Node(60);   // 60 <-- 30 --> 70
        root.right.right = new Node(70);
        
        root.right.right.left = new Node(80);   // 80 <-- 70
        
    }
    
    public void display(){
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.getData()+ "  ");
            if(temp.left != null)
                q.offer(temp.left);
            if(temp.right != null)
                q.offer(temp.right);
        }
    }
}

public class C_LevelOrder_Traversal {
    public static void main(String[] args) {
        Tree2 t = new Tree2();
        t.createTree();
        System.out.print("Level Order Traversal: ");
        t.display();
    }
}
