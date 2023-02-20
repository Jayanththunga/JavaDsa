// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class peekIndexinMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                i=mid;
            }else{
                j=mid;
            }
        }

        return -1;
    }
}