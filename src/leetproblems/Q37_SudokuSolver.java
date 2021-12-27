package leetproblems;

public class Q37_SudokuSolver {
	public void solveSudoku(char[][] board) {
		solve(board, 0, 0);
	}

	public boolean solve(char[][] board, int r, int c) {
		if (r == 9)
			return true;
		int nr = 0, nc = 0;
		if (c == board.length - 1) {
			nc = 0;
			nr = r + 1;
		} else {
			nr = r;
			nc = c + 1;
		}
		if (board[r][c] != '.') {
			if (solve(board, nr, nc))
				return true;
		} else {
			for (int i = 1; i <= 9; ++i) {
				if (isValid(board, r, c, i)) {
					board[r][c] = (char) (i + '0');
					if (solve(board, nr, nc))
						return true;
					else
						board[r][c] = '.';
				}
			}
		}
		return false;
	}

	public boolean isValid(char[][] board, int r, int c, int val) {
		for (int i = 0; i < 9; ++i) {
			if (board[r][i] == (char) (val + '0'))
				return false;
			if (board[i][c] == (char) (val + '0'))
				return false;
		}
		int row = (r / 3) * 3, col = (c / 3) * 3;
		for (int i = row; i < row + 3; ++i) {
			for (int j = col; j < col + 3; ++j) {
				if (board[i][j] == (char) (val + '0'))
					return false;
			}
		}
		return true;
	}
}
