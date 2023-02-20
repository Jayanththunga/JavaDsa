// https://leetcode.com/problems/keep-multiplying-found-values-by-two/

import java.util.HashMap;



public class keepMultFoundValuesby2 {
    public int findFinalValue(int[] arr, int num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, 1);
        }

        while(map.containsKey(num)){
            num*=2;
        }
                
        return num;
    }
}
