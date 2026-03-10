```java
public class Solution {
    public int[] preorderTraversal(TreeNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder(A, list);
         int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void preorder(TreeNode node, ArrayList<Integer> list){
        if(node == null) return;
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }
}

```