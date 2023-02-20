// https://leetcode.com/contest/biweekly-contest-98/problems/maximum-difference-by-remapping-a-digit/
public class maxDiffByRemappingDigits {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)!='9') break;
            i++;
        }
        
        if(i==str.length()) return num;
        String rep = String.valueOf(str.charAt(i));
        String max = str.replaceAll(rep, "9");
        int maxi = Integer.parseInt(max);
        
        rep = String.valueOf(str.charAt(0));
        String min = str.replaceAll(rep, "0");
        int mini = Integer.parseInt(min);
        
        return maxi-mini;
        
    }
}
