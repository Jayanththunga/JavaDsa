// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

public class minRecordToGetKBlackBox {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<blocks.length()-k+1;i++){
            String st = blocks.substring(i,i+k).replaceAll("B","");
            ans = Math.min(ans, st.length());
        }

        return ans;
    }
}
