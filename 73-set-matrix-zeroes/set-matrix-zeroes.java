class Solution {
    public void setZeroes(int[][] arr) {
        //Better approach

        int m = arr.length;
        int n = arr[0].length;

        int row[] = new int[m];
        int col[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}