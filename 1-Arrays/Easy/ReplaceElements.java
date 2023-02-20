// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

public class ReplaceElements{
    public int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        ans[arr.length-1] = -1;
        max = Math.max(max, arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }

        return ans;
    }
}