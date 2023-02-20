// https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class lonelyNums {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> lst = new LinkedList<>();
        for(int i:nums){
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }


        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.get(num)==1 && !map.containsKey(num-1) && !map.containsKey(num+1)){
                lst.add(num);
            }
        }
        
        return lst;
    }
}