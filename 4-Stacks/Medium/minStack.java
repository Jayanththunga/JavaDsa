import java.util.ArrayList;
import java.util.PriorityQueue;

// https://leetcode.com/problems/min-stack/description/

class MinStack {

    ArrayList<Integer> arr;
    PriorityQueue<Integer> pq;

    public MinStack() {
        arr = new ArrayList<>();
        pq = new PriorityQueue<>();    
    }
    
    public void push(int val) {
        arr.add(val);
        pq.add(val);
    }
    
    public void pop() {
        int ele = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        pq.remove(ele);
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        return pq.peek();
    }
}