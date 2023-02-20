import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/all-divisions-with-the-highest-score-of-a-binary-array/


public class allDevisionsWithHigheshScore {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> lst;
        int ones = 0;
        for(int i:nums){
            if(i==1) ones++;
        }

        int zeros=0, i=0;
        // division 1:
        int max=ones+zeros;
        lst = new LinkedList<>();
        lst.add(i);
        i++;

        while(i<=nums.length){
            if(nums[i-1]==0) zeros++;
            else ones--;
            int x = ones+zeros;
            
            if(x==max) lst.add(i);
            if(x>max){
                lst = new LinkedList<>();
                lst.add(i);
                max=x;
            }
            i++;
        }

        return lst;
    }
}