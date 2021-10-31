package leetproblems;

public class Q419_BattleshipsInABoard {
	public int countBattleships(char[][] board) {
		int result = 0;
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[0].length; ++j) {
				if (board[i][j] == 'X') {
					result++;
					dfs(i, j, board);
				}
			}
		}
		return result;
	}

	public void dfs(int i, int j, char[][] board) {

		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '.')
			return;

		board[i][j] = '.';

		dfs(i, j + 1, board);
		// dfs(i, j-1, board); // we are traversing from top left--> alread visited prev
		// row and column, no need because we are changing previous column to '.'
		dfs(i + 1, j, board);
		// dfs(i-1, j, board);
	}
}
