// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

import java.util.ArrayList;


public class rearrangeElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : nums){
            if(i>0) pos.add(i);
            else neg.add(i);
        }
        int i=0,j=0;
        while(i<pos.size() && i<neg.size() && j<nums.length){
            nums[j]=pos.get(i);
            j++;
            nums[j]=neg.get(i);
            i++;j
            ++;
        }
        return nums;
    }
}

class TwoPointers{
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int p=0, n=1;
        for(int i: nums){
            if(i>0){
                arr[p] = i;
                p+=2;
            }else{
                arr[n] = i;
                n+=2;
            }
        }
        return arr;
    }
}