// https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/

public class scoreofAllPrefixArrays {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            ans[i] = sum + max + nums[i];
            sum += (max + nums[i]);
        }

        return ans;
    }
}
