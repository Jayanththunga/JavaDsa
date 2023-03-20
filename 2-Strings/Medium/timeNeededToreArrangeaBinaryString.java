// https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string/description/

public class timeNeededToreArrangeaBinaryString {
    public int secondsToRemoveOccurrences(String s) {
        int count = 0;
        while(s.contains("01")){
            s = s.replaceAll("01", "10");
            count++;
        }

        return count;
    }
}
