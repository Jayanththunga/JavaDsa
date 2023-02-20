// https://leetcode.com/problems/can-place-flowers/description/


public class canPlaceFlowers {
    public boolean canPlaceFlower(int[] arr, int n) {
        int l = arr.length;
        for(int i=0;i<l && n>0; i++){
            if(arr[i]==0){
                int next = (i==l-1)? 0: arr[i+1];
                int prev = (i==0)? 0: arr[i-1];
                if(next==0 && prev==0){
                    n--;
                    arr[i]=1;
                }
            }
        }
        return n==0;
    }
}