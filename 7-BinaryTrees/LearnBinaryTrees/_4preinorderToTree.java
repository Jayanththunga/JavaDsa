// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

public class _4preinorderToTree {
    private static TreeNode findnode(int[] preorder, int[] inorder, int pi, int pj, int ii, int ij) {
        if (pi < 0 || pi >= preorder.length || pi > pj)
            return null;
        TreeNode node = new TreeNode(preorder[pi]);
        if (pi == pj && ii == ij)
            return node;

        int i = ii;
        for (i = ii; i <= ij; i++) {
            if (inorder[i] == node.val)
                break;
        }

        node.left = findnode(preorder, inorder, pi + 1, pi + (i - ii), ii, i - 1);
        node.right = findnode(preorder, inorder, pi + (i - ii) + 1, pj, i + 1, ij);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return findnode(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
}
