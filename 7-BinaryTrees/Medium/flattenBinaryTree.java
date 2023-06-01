// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

import java.util.ArrayList;

public class flattenBinaryTree {
    private static void preorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;

        arr.add(root.val);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<Integer> arr = new ArrayList<>();
        preorder(root, arr);

        root.left=null;
        TreeNode tail = root;
        int i = 1;
        while(i<arr.size()){
            TreeNode node = new TreeNode(arr.get(i));
            tail.right = node;
            tail = tail.right;
            i++;
        }
    }
}
