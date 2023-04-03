import java.util.Arrays;

// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/

public class sucessfulPairsofSpellsandPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int arr[] = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            arr[i] = (potions.length - find(spells[i], success, potions));
        }

        return arr;
    }

    private static int find(int spell, long success, int[] potions) {
        int i = 0, j = potions.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if ((long) potions[mid] * spell >= success)
                j = mid - 1;
            else
                i = mid + 1;
        }

        return i;
    }
}
