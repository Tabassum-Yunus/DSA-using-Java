package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeI{
    Node root;
    
    public void createTreee(){
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
    }
    
    public void preOrder(){
        if(root==null)
            return; 
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            Node temp = stk.pop();
            System.out.print(temp.getData()+"  ");
            if(temp.right != null)
                stk.push(temp.right);  
            if(temp.left != null)
                stk.push(temp.left);
        }
    }
}


public class D_Iterative_PreOrder_Traversal {
    public static void main(String[] args) {
        TreeI t = new TreeI();
        t.createTreee();
        t.preOrder();
    }
}
