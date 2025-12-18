class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class SumOfNodeValues {
    public static void main(String[] args) {
         BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        totalSum(tree);
        
    }

    public int totalSum(TreeNode root){
        if(root == null){
            return 0;
        }
        return root.val + totalSum(root.left) + totalSum(root.right);
    }
    
}
