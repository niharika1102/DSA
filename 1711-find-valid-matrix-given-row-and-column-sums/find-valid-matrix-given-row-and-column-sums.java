class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;

        int arr[][] = new int[m][n];

        int r = 0;
        int c = 0;

        while (r < m && c < n) {
            int ele = Math.min(rowSum[r], colSum[c]);
            arr[r][c] = ele;
            rowSum[r] -= ele;
            colSum[c] -= ele;

            if (colSum[c] == 0) {
                c++;
            }
            else {
                r++;
            }
        }

        return arr;
    }
}