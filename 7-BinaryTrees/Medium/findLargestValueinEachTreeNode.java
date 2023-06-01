// https://leetcode.com/problems/find-largest-value-in-each-tree-row/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class findLargestValueinEachTreeNode {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> lst = new LinkedList<>();
        if(root==null) return lst;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while(qu.peek()!=null){
            int max = Integer.MIN_VALUE;
            while(qu.peek()!=null){
                TreeNode node = qu.poll();
                max = Math.max(max, node.val);
                if(node.left!=null) qu.add(node.left);
                if(node.right!=null) qu.add(node.right);
            }

            qu.poll();
            qu.add(null);
            lst.add(max);
        }

        return lst;
    }
    
}