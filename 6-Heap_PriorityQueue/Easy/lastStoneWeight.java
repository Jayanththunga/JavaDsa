// https://leetcode.com/problems/last-stone-weight/
import java.util.*;
public class lastStoneWeight {
    public int lastStoneWt(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }

        while(pq.size()>1){
            int r1 = pq.poll();
            int r2 = pq.poll();
            if(r1==r2) continue;
            else pq.add(Math.max(r1, r2)-Math.min(r1, r2));
        }

        if(pq.isEmpty()) return 0;
        else return pq.poll();
    }
}
