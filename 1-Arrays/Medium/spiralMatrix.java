// https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rsi = 0, rei = m - 1, csi = 0, cei = n - 1;
        int tot = m * n, cnt = 0;
        List<Integer> lst = new ArrayList<>();
        while (cnt < tot) {
            // go left to right:
            for (int i = csi; cnt < tot && i <= cei; i++) {
                lst.add(matrix[rsi][i]);
                cnt++;
            }
            rsi++;
            // go top to bottom:
            for (int i = rsi; cnt < tot && i <= rei; i++) {
                lst.add(matrix[i][cei]);
                cnt++;
            }
            cei--;
            // go right to left:
            for (int i = cei; cnt < tot && i >= csi; i--) {
                lst.add(matrix[rei][i]);
                cnt++;
            }
            rei--;
            // go down to up:
            for (int i = rei; cnt < tot && i >= rsi; i--) {
                lst.add(matrix[i][csi]);
                cnt++;
            }
            csi++;
        }

        return lst;
    }
}
