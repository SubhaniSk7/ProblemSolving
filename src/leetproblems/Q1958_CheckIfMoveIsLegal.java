package leetproblems;

public class Q1958_CheckIfMoveIsLegal {
	public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
		return right(board, rMove, cMove, color) || left(board, rMove, cMove, color) || up(board, rMove, cMove, color) || down(board, rMove, cMove, color) || leftUp(board, rMove, cMove, color) || rightUp(board, rMove, cMove, color)
				|| leftDown(board, rMove, cMove, color) || rightDown(board, rMove, cMove, color);
	}

	public boolean right(char[][] board, int r, int c, char color) {
		for (int j = c + 1; j < board[0].length; ++j) {
			if (board[r][j] == '.')
				return false;
			else if (board[r][j] == color)
				return j - c + 1 >= 3;
		}
		return false;
	}

	public boolean left(char[][] board, int r, int c, char color) {
		for (int j = c - 1; j >= 0; --j) {
			if (board[r][j] == '.')
				return false;
			else if (board[r][j] == color)
				return c - j + 1 >= 3;
		}
		return false;
	}

	public boolean up(char[][] board, int r, int c, char color) {
		for (int i = r - 1; i >= 0; --i) {
			if (board[i][c] == '.')
				return false;
			else if (board[i][c] == color)
				return r - i + 1 >= 3;
		}
		return false;
	}

	public boolean down(char[][] board, int r, int c, char color) {
		for (int i = r + 1; i < board.length; ++i) {
			if (board[i][c] == '.')
				return false;
			else if (board[i][c] == color)
				return i - r + 1 >= 3;
		}
		return false;
	}

	public boolean leftUp(char[][] board, int r, int c, char color) {
		for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; --i, --j) {
			if (board[i][j] == '.')
				return false;
			else if (board[i][j] == color)
				return c - j + 1 >= 3;
		}
		return false;
	}

	public boolean rightUp(char[][] board, int r, int c, char color) {
		for (int i = r - 1, j = c + 1; i >= 0 && j < board[0].length; --i, ++j) {
			if (board[i][j] == '.')
				return false;
			else if (board[i][j] == color)
				return j - c + 1 >= 3;
		}
		return false;
	}

	public boolean leftDown(char[][] board, int r, int c, char color) {
		for (int i = r + 1, j = c - 1; i < board.length && j >= 0; ++i, --j) {
			if (board[i][j] == '.')
				return false;
			else if (board[i][j] == color)
				return c - j + 1 >= 3;
		}
		return false;
	}

	public boolean rightDown(char[][] board, int r, int c, char color) {
		for (int i = r + 1, j = c + 1; i < board.length && j < board[0].length; ++i, ++j) {
			if (board[i][j] == '.')
				return false;
			else if (board[i][j] == color)
				return j - c + 1 >= 3;
		}
		return false;
	}
}
