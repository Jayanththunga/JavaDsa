// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.Arrays;
import java.util.HashMap;

public class longestConsSequence {

    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            int che = i;
            int cons = 0;
            while(true){
                if(!map.containsKey(che)) break;
                else{
                    map.remove(che);
                    cons++;
                    che++;
                }
            }
            max = Math.max(max, cons);
        }

        System.out.println(map);

        return max;
    }
}