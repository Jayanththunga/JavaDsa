// https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/

public class diffBetweenOnesandZeros {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] row1 = new int[grid.length];
        int[] col1 = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            int rsum = 0;
            for (int j = 0; j < grid[0].length; j++) {
                rsum += grid[i][j];
            }
            row1[i] = rsum;
        }

        for (int i = 0; i < grid[0].length; i++) {
            int csum = 0;
            for (int j = 0; j < grid.length; j++) {
                csum += grid[j][i];
            }
            col1[i] = csum;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = row1[i] + col1[j] - (grid.length - row1[i]) - (grid[i].length - col1[j]);
            }
        }
        return grid;
    }
}