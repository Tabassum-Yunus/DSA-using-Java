package Tree;

class Node{
    private int data;
    Node left;
    Node right;
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root;
    
    public void createTree(){
        root = new Node(10);
        
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        root.right.right.left = new Node(80);
    } 
    
    public void createTreee(){
        root = new Node(10);
        Node fisrt = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(60);
        Node fifth = new Node(70);
        Node sixth = new Node(80);
                
        root.left = fisrt;
        root.right = second;
        
        root.left.left = third;
        
        root.right.left = fourth;
        root.right.right = fifth;
        
        root.right.right.left = sixth;
    } 
    
}

public class A_Creation {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.createTree();
    }
}
