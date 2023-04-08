// https://leetcode.com/problems/maximum-subarray/

// using Kadane algo: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

public class maxiumSubArray {
    public int maxSubArray(int[] nums) {
        int summax = Integer.MIN_VALUE;
        int sumsofar = 0;
        for (int i : nums) {
            sumsofar += i;
            summax = Math.max(summax, sumsofar);
            if (sumsofar < 0)
                sumsofar = 0;
        }

        return summax;
    }
}
