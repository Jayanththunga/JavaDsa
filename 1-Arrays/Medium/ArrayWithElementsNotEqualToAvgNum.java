// https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/

import java.util.Arrays;

public class ArrayWithElementsNotEqualToAvgNum {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[nums.length];
        int i = 0, j = nums.length / 2;
        for (int k = 0, m = 1; k < ans.length; k = k + 2, m = m + 2) {
            ans[k] = nums[j];
            if (m < ans.length)
                ans[m] = nums[i];
            j++;
            i++;
        }

        return ans;
    }
}
