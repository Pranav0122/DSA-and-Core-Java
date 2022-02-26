package BinaryTree;

import java.util.*;

public class BinaryTree {
    private Scanner sc=new Scanner(System.in);
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    public BinaryTree(){
        root=this.construct();
    }
    private Node construct(){
        //1.User se input
        //2.tree banate jaenge
        int v=sc.nextInt();
        if(v==-1)
            return null;
        Node nn=new Node(v);
        nn.left=construct();//left subtree de dia
        nn.right=construct();//right subtree de dia
        return nn;
    }
    public void display(){
        display(root);
    }
    private void display(Node root){
        if(root==null)
            return;
        String str="";
        if(root.left!=null){
            str+=root.left.val;
        }
        else{
            str+="_";
        }
        str+=" => "+root.val+" <= ";
        if(root.right!=null){
            str+=root.right.val;
        }
        else{
            str+="_";
        }
        System.out.println(str);
        display(root.left);
        display(root.right);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public boolean hasPathSum(int targetSum) {
        return pathSum(root,targetSum,0);
    }
    private boolean pathSum(Node root, int targetSum,int csum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(csum+root.val==targetSum)
                return true;
            else
                return false;
        }
        boolean leftAns=pathSum(root.left,targetSum,csum+root.val);
        boolean rightAns=pathSum(root.right,targetSum,csum+root.val);
        return leftAns||rightAns;
    }

    public int countNodes(){
        return countNodes(root);
    }
    private int countNodes(Node root){
        if(root==null)
            return 0;
        int leftA=countNodes(root.left);
        int rightA=countNodes(root.right);
        int total=leftA+rightA+1;
        return total;
    }
    private void levelOrderLineWise(Node root){
        List<List<Integer>> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        List<Integer> lvlist=new ArrayList<>();
    }
}
