// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


public class twoSum2 {
    public int[] twoSum(int[] arr, int x) {
        int i=0, j=arr.length-1;
        int ans[] = new int[2];
        while(i<=j){
            if(arr[i]+arr[j]<x) i++;
            else if(arr[i]+arr[j]>x) j--;
            else{
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
        }

        return ans;
    }
}