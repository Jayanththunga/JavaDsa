// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

import java.util.*;

public class levelOrder2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lst = new LinkedList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);

        while(qu.peek()!=null){
            List<Integer> list = new LinkedList<>();
            while(qu.peek()!=null){
                TreeNode nd = qu.poll();
                if(nd.left!=null) qu.add(nd.left);
                if(nd.right!=null) qu.add(nd.right);
                list.add(nd.val);
            }

            qu.poll();
            qu.add(null);
            lst.add(0, list);
        }

        return lst;
    }
}
