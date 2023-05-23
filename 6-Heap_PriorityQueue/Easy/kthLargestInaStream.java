// https://leetcode.com/problems/kth-largest-element-in-a-stream/

import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> pq;
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        pq = new PriorityQueue<>();
        for(int i=0;i<k && i<nums.length;i++){
            pq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<size){
            pq.add(val);
        }
        else if(pq.peek()<val){
            pq.poll();
            pq.add(val);
        }

        return pq.peek();
    }
}