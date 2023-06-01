// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

public class _5postinorderToTree {
    private static TreeNode find(int[] postorder, int pi, int pj, int[] inorder, int ii, int ij) {
        if (pj < pi || pj >= postorder.length || pj < 0)
            return null;
        TreeNode node = new TreeNode(postorder[pj]);
        if (pi == pj && ii == ij)
            return node;
        int i = ii;
        for (i = ii; i <= ij; i++) {
            if (inorder[i] == node.val)
                break;
        }
        node.left = find(postorder, pi, pi + i - ii - 1, inorder, ii, i - 1);
        node.right = find(postorder, pi + i - ii, pj - 1, inorder, i + 1, ij);

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return find(postorder, 0, postorder.length - 1, inorder, 0, postorder.length - 1);
    }
}
