import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
       data=val;
       left=null;
       right=null;
    }
}
class BinaryTreeInorder{
    TreeNode root;
    void inorderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }
    // Wrapper function to call the recursive function
    void inorderTraversal() {
        inorderTraversal(root);
    }
    public static void main(String[] args) {
        BinaryTreeInorder tree = new BinaryTreeInorder();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.right = new TreeNode(6);
        System.out.println("Inorder Traversal :  " );
        tree.inorderTraversal(); 
    }
}
    