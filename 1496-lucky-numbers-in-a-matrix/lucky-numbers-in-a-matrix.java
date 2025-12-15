import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                int k;
                for (k = 0; k < n; k++) {
                    if (matrix[i][k] < val)
                        break;
                }
                if (k != n) continue;
                for (k = 0; k < m; k++) {
                    if (matrix[k][j] > val)
                        break;
                }
                if (k != m) continue;
                result.add(val);
            }
        }
        return result;
    }
}
