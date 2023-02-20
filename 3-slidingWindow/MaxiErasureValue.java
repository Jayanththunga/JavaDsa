import java.util.HashSet;

// https://leetcode.com/problems/maximum-erasure-value/description/

public class MaxiErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0, max = Integer.MIN_VALUE, sum = 0;
        while (i < nums.length && j < nums.length) {
            if (set.contains(nums[j])) {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            } else {
                set.add(nums[j]);
                sum += nums[j];
                max = Math.max(max, sum);
                j++;
            }
            // System.out.println(i+" "+j+" "+sum);
        }
        return max;
    }
}
