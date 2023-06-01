// https://leetcode.com/problems/find-bottom-left-tree-value/

import java.util.LinkedList;
import java.util.Queue;

public class findBottomLeftTreeValues {
    public int findBottomLeftValue(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);

        while(qu.peek()!=null){
            boolean right = false;
            while(qu.peek()!=null){
                TreeNode nd = qu.poll();
                if(!right) ans = nd.val;
                right = true;
                if(nd.left!=null) qu.add(nd.left);
                if(nd.right!=null) qu.add(nd.right);
            }

            qu.poll();
            qu.add(null);
        }

        return ans;
    }
}