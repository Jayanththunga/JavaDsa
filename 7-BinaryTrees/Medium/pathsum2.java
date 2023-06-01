// https://leetcode.com/problems/path-sum-ii/
import java.util.*;

public class pathsum2 {
    private static void addlist(TreeNode root,int x, List<List<Integer>> ans, List<Integer> list){
        if(root==null) return;

        if(root.left==null && root.right==null){
            if(root.val==x){
                list.add(root.val);
                ans.add(list);
            }
            return;
        }

        if(root.left!=null){
            List<Integer> left = new LinkedList<>(list);
            left.add(root.val);
            addlist(root.left ,x-root.val, ans, left);
        }

        if(root.right!=null){
            List<Integer> right = new LinkedList<>(list);
            right.add(root.val);
            addlist(root.right, x-root.val, ans, right);
        }

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root==null) return ans;
        List<Integer> leftlist = new LinkedList<>();
        List<Integer> rightlist = new LinkedList<>();
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                leftlist.add(root.val);
                ans.add(leftlist);
            }
            return ans;
        }

        leftlist.add(root.val);
        rightlist.add(root.val);
        addlist(root.left ,targetSum-root.val, ans, leftlist);
        addlist(root.right, targetSum-root.val, ans, rightlist);

        return ans; 
    }
}
