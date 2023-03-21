// https://leetcode.com/problems/number-of-zero-filled-subarrays/description/

public class noOf0filledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        int i = 0;
        long ans = 0;
        while (i < nums.length) {
            long count = 0;
            while (i < nums.length && nums[i] == 0) {
                count++;
                i++;
            }
            ans += (count) * (count + 1) / 2;
            if (count == 0)
                i++;
        }
        return ans;
    }
}