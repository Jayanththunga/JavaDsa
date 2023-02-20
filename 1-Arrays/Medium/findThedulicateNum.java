// https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;
import java.util.HashMap;

public class findThedulicateNum {}

class usingHashMap {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)) return i;
            else map.put(i, 1);
        }

        return -1;
    }
}

class sorting {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}
