// https://leetcode.com/problems/boats-to-save-people/
import java.util.Arrays;

public class minNoofBoats {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int nob = 0;
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            int sum = people[i] + people[j];
            if (sum <= limit) {
                nob++;
                i++;
                j--;
            } else {
                nob++;
                j--;
            }
        }
        return nob;
    }
}
