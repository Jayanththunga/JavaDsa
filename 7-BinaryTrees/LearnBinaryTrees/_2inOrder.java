import java.util.ArrayList;
import java.util.List;

public class _2inOrder {
    private static void findans(TreeNode root, List<Integer> lst) {
        if (root == null)
            return;

        findans(root.left, lst);
        lst.add(root.val);
        findans(root.right, lst);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        findans(root, lst);

        return lst;
    }
}
