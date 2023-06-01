// https://leetcode.com/problems/maximum-binary-tree/

public class maxiumBinaryTree {
    private static TreeNode find(int[] nums, int si, int ei) {
        if (si > ei)
            return null;
        if (si == ei) {
            TreeNode node = new TreeNode(nums[si]);
            return node;
        }

        int max = Integer.MIN_VALUE;
        int p = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] > max) {
                max = nums[i];
                p = i;
            }
        }

        TreeNode node = new TreeNode(max);
        node.left = find(nums, si, p - 1);
        node.right = find(nums, p + 1, ei);

        return node;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return find(nums, 0, nums.length - 1);
    }
}
