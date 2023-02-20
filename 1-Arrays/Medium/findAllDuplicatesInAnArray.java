// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findAllDuplicatesInAnArray {}

class usingMap {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            if(ele.getValue() == 2) lst.add(ele.getKey());
        }

        return lst;
    }
}


class withoutMap {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length+1];
        List<Integer> lst = new ArrayList<>();
        for(int i: nums){
            arr[i]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2) lst.add(i);
        }
        return lst;
    }
}
