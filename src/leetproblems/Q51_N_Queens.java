package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q51_N_Queens {
	List<List<String>> result = new ArrayList<>();

	public List<List<String>> solveNQueens(int n) {
		int[][] board = new int[n][n];
		solve(board, n, 0);
		return result;
	}

	public void solve(int[][] board, int n, int row) {
		if (row >= n) {
			ArrayList<String> al = new ArrayList<>();
			for (int i = 0; i < n; ++i) {
				String s = "";
				for (int j = 0; j < n; ++j)
					s += (board[i][j] == 1 ? "Q" : ".");
				al.add(s);
			}
			result.add(al);
			return;
		}
		for (int col = 0; col < n; ++col) {
			board[row][col] = 1;
			if (valid(board, row, col))
				solve(board, n, row + 1);
			board[row][col] = 0;
		}
	}

	public boolean valid(int[][] board, int r, int c) {
		for (int i = 0; i < r; ++i) {// up
			if (board[i][c] == 1)
				return false;
		}
		for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; --i, --j) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = r - 1, j = c + 1; i >= 0 && j < board[0].length; --i, ++j) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}
}
