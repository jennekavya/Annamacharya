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
class BinaryTree{
    TreeNode root;
    int countLeafNodes(TreeNode node){
        if(node==null){
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        // Recursively count leaf nodes in the left and right subtrees
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
    // Wrapper function to call the recursive function
    int countLeafNodes() {
        return countLeafNodes(root);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.right = new TreeNode(6);
        System.out.println("Number of leaf nodes: " + tree.countLeafNodes());
    }
}
    