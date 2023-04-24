import java.util.HashSet;

// https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/

public class countNoofIntAferRev {
    private static int findrev(int num){
        int rev= 0;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }

    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(findrev(nums[i]));
        }

        return set.size();
    }    
}
