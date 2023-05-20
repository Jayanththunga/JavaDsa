import java.util.ArrayList;
import java.util.List;

public class _3postOrder {
    private static void findans(TreeNode root, List<Integer> lst) {
        if (root == null)
            return;

        findans(root.left, lst);
        findans(root.right, lst);
        lst.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        findans(root, lst);

        return lst;
    }
}
