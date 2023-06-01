// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

import java.util.*;

public class zizzaglevel {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new LinkedList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        int m = 0;

        while(qu.peek()!=null){
            List<Integer> list = new LinkedList<>();
            while(qu.peek()!=null){
                TreeNode node = qu.poll();
                if(node.left!=null) qu.add(node.left);
                if(node.right!=null) qu.add(node.right);
                if(m==0) list.add(node.val);
                else list.add(0, node.val);
            }

            lst.add(list);
            qu.poll();
            qu.add(null);
            if(m==1) m=0;
            else m=1;
        }

        return lst;
    }
}
