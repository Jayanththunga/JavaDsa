import java.util.Arrays;

// https://leetcode.com/problems/boats-to-save-people/

public class boatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int nob = 0;
        Arrays.sort(people);

        int i=0, j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                nob++;
                i++;
                j--;
            }else{
                nob++;
                j--;
            }
        }

        return nob;
    }
}