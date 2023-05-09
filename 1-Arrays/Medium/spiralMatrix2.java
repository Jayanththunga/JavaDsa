// https://leetcode.com/problems/spiral-matrix-ii/

public class spiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int rsi = 0, csi = 0, rei = n - 1, cei = n - 1;
        int tot = n * n, start = 1;
        int ans[][] = new int[n][n];
        while (start <= tot) {
            for (int i = csi; i <= cei && start <= tot; i++) {
                ans[rsi][i] = start;
                start++;
            }
            rsi++;

            for (int i = rsi; i <= rei && start <= tot; i++) {
                ans[i][cei] = start;
                start++;
            }
            cei--;

            for (int i = cei; i >= csi && start <= tot; i--) {
                ans[rei][i] = start;
                start++;
            }
            rei--;

            for (int i = rei; i >= rsi && start <= tot; i--) {
                ans[i][csi] = start;
                start++;
            }
            csi++;
        }

        return ans;
    }
}
