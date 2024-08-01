import java.util.*;

public class NQueens {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        int board[][] = new int[n][n];

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        solve(res, n, 0, board);
        return res;
    }

    public static void addToList(int board[][], ArrayList<ArrayList<Integer>> res, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp.add(board[i][j]);
            }
        }

        res.add(temp);
    }

    public static void solve(ArrayList<ArrayList<Integer>> res, int n, int col, int board[][]) {
        //base case
        if(col == n) {
            addToList(board, res, col);
            return;
        }

        for (int r = 0; r < n; r++) {
            if (isPossible(r, col, board, n)) {
                board[r][col] = 1;
                solve(res, n, col + 1, board);
                board[r][col] = 0;
            }
        }
    }

    public static boolean isPossible(int row, int col, int board[][], int n) {
        int x = row;
        int y = col;

        //check column
        while (y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            y--;
        }

        //check diagonal up
        x = row;
        y = col;

        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y--;
        }

        //checking diagonal down
        x = row;
        y = col;

        while (x < n && y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            x++;
            y--;
        }

        return true;
    }
}
