// https://leetcode.com/problems/check-knight-tour-configuration/

public class checkKnightConfiguration {
    public boolean checkValidGrid(int[][] grid) {
        int num = 1;
        int n = grid.length;
        boolean vis[][] = new boolean[n][n];
        vis[0][0] = true;
        int i = 0, j = 0;

        while (num < n * n) {
            if (search(i - 1, j - 2, num, grid, vis)) {
                num++;
                i = i - 1;
                j = j - 2;
            } else if (search(i - 2, j - 1, num, grid, vis)) {
                num++;
                i = i - 2;
                j = j - 1;
            } else if (search(i + 1, j - 2, num, grid, vis)) {
                num++;
                i = i + 1;
                j = j - 2;
            } else if (search(i + 2, j - 1, num, grid, vis)) {
                num++;
                i = i + 2;
                j = j - 1;
            } else if (search(i - 2, j + 1, num, grid, vis)) {
                num++;
                i = i - 2;
                j = j + 1;
            } else if (search(i - 1, j + 2, num, grid, vis)) {
                num++;
                i = i - 1;
                j = j + 2;
            } else if (search(i + 1, j + 2, num, grid, vis)) {
                num++;
                i = i + 1;
                j = j + 2;
            } else if (search(i + 2, j + 1, num, grid, vis)) {
                num++;
                i = i + 2;
                j = j + 1;
            } else
                return false;
        }

        return true;

    }

    private static boolean search(int i, int j, int num, int[][] grid, boolean vis[][]) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid.length)
            return false;
        if (grid[i][j] == num && vis[i][j] == false) {
            vis[i][j] = true;
            return true;
        }

        return false;
    }
}
