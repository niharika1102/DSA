import java.util.* ;
import java.io.*; 
public class SodukoSolver {
	public static boolean solve(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[0].length; j++) {
				if (sudoku[i][j] == 0) {
					for (int k = 1; k < 10; k++) {
						if (isValid(sudoku, i, j, k)) {
							sudoku[i][j] = k;

							if (solve(sudoku)) 
								return true;

							else 
								sudoku[i][j] = 0;

						}
					}

					return false;
				}
			}
		}

		return true;
	}

	public static boolean isValid(int[][] sudoku, int row, int col, int val) {
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][col] == val) 
				return false;
			
			if (sudoku[row][i] == val) 
				return false;
			
			if (sudoku[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == val) 
				return false;
			
		}

		return true;
	}

	public static void solveSudoku(int[][] sudoku) {
        // Write your code here.
		solve(sudoku);
	}
}
