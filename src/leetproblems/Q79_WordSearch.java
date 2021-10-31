package leetproblems;

public class Q79_WordSearch {

	boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		visited = new boolean[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (board[i][j] == word.charAt(0) && search(i, j, 0, word, board))
					return true;
			}
		}
		return false;
	}

	public boolean search(int i, int j, int index, String word, char[][] board) {
		if (index == word.length())
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(index) != board[i][j]
				|| visited[i][j])
			return false;

		visited[i][j] = true;
		if (search(i + 1, j, index + 1, word, board) || search(i - 1, j, index + 1, word, board)
				|| search(i, j + 1, index + 1, word, board) || search(i, j - 1, index + 1, word, board))
			return true;

		visited[i][j] = false;
		return false;
	}
}
