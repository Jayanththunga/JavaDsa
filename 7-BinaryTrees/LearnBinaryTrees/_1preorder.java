import java.util.*;

public class _1preorder {
    private static void findans(TreeNode root, List<Integer> lst) {
        if (root == null)
            return;

        lst.add(root.val);
        findans(root.left, lst);
        findans(root.right, lst);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        findans(root, lst);

        return lst;
    }

}