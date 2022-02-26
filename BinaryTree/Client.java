package BinaryTree;

public class Client {
    public static void main(String[] args) {
        //10 20 -1 40 -1 -1 50 60 -1 -1 -1
        BinaryTree bt=new BinaryTree();
        //bt.display();
//        bt.preOrder();
//        System.out.println();
//        bt.inOrder();
//        System.out.println();
//        bt.postOrder();
        System.out.println(bt.hasPathSum(70));
        System.out.println(bt.countNodes());
    }
}
