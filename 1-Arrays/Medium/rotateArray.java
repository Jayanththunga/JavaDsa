// https://leetcode.com/problems/rotate-array/

public class rotateArray {
    public void rotate(int[] nums, int k) {
        while(k>nums.length){
            k=k%nums.length;
        }

        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
    }

    private void rotate(int[] nums, int si, int ei){
        while(si<ei){
            nums[si] = nums[ei] + nums[si];
            nums[ei]= nums[si] - nums[ei];
            nums[si] = nums[si] - nums[ei];
            si++;
            ei--;
        }
    }
}
