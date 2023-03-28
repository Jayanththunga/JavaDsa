// https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;

public class twoSum {
    public int[] twoSumsol(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = 0;
        for (int i : nums) {
            map.put(i, m);
            m++;
        }

        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
        }

        return ans;
    }
}
