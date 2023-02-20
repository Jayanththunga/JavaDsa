// https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/

import java.util.Arrays;


public class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int a) {
        int n = capacity.length;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(arr);

        int i = 0;
        while(a>0 && i<n){
            if(a<arr[i]){
                break;
            }
            if(arr[i]==0){
                i++;
            }else{
                a = a - arr[i];
                i++; 
            }
        }

        return i;
    }
}