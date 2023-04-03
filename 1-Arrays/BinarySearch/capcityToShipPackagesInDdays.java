// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class capcityToShipPackagesInDdays {
    public static int finddays(int[] weights, int mcap){
        int d = 1, cap =0;
        for(int i: weights){
            cap+=i;
            if(cap<=mcap) continue;
            else{
                cap=i;
                d++;
            }
        }
        return d;
    }

    public int shipWithinDays(int[] weights, int days) {
        int min = 0, max = 0;
        for(int i: weights){
            min = Math.max(min, i);
            max+=i;
        }
        int ans = 0;
        while(min<=max){
            int mid = (max+min)/2;
            int d = finddays(weights, mid);
            if(d<=days){
                max=mid-1;
                ans=mid;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
}