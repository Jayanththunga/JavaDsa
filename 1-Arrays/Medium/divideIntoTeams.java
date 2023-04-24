import java.util.Arrays;

// https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/

public class divideIntoTeams {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        long prod = 0;
        int i = 0, j = n - 1, sum = skill[0] + skill[n - 1];
        while (i < j) {
            if (skill[i] + skill[j] != sum)
                return -1;
            else
                prod += (skill[i] * skill[j]);

            i++;
            j--;
        }

        return prod;
    }
}
