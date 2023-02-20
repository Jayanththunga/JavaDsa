// https://leetcode.com/problems/smallest-value-of-the-rearranged-number/description/

import java.util.ArrayList;
import java.util.Collections;

public class smallestValueOfRearrangedNumber {
    public long smallestNumber(long num) {
        ArrayList<Long> arr = new ArrayList<>();
        long x;
        if(num<0) x=-num;
        else x=num;
        while(x>0){
            arr.add(x%10);
            x/=10;
        }
        Collections.sort(arr);

        long ans = 0;
        if(num<0){
            long i=1;
            int j=0;
            while(j<arr.size()){
                ans+=i*arr.get(j);
                j++;
                i*=10;
            }
            ans=-ans;
        }else{
            int i = 0;
            for(i=0;i<arr.size();i++){
                if(arr.get(i)!=0) break;
            }

            // swap:
            if(i<arr.size()){
                Collections.swap(arr, 0, i);
            }

            int j=arr.size()-1;
            long p=1;
            while(j>=0){
                ans+=p*arr.get(j);
                j--;
                p*=10;
            }
        }

        return ans;
    }
}
