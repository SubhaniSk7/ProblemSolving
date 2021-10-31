package leetproblems;

import java.util.HashSet;
import java.util.Set;

public class Q36_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		Set<Integer> rows = new HashSet<>(), cols = new HashSet<>(), boxes = new HashSet<>();

		for (int i = 0; i < 9; ++i) {
			rows = new HashSet<>();
			for (int j = 0; j < 9; ++j) {
				if (board[i][j] == '.')
					continue;
				int v = board[i][j] - '0';
				if (rows.contains(v))
					return false;
				rows.add(v);
			}
		}

		for (int j = 0; j < 9; ++j) {
			cols = new HashSet<>();
			for (int i = 0; i < 9; ++i) {
				if (board[i][j] == '.')
					continue;
				int v = board[i][j] - '0';
				if (cols.contains(v))
					return false;
				cols.add(v);
			}
		}

		int[] c = { 1, 4, 7 };
		for (int x : c) {
			for (int y : c) {
				boxes = new HashSet<>();
				for (int i = x - 1; i <= x + 1; ++i) {
					for (int j = y - 1; j <= y + 1; ++j) {
						if (board[i][j] == '.')
							continue;
						int v = board[i][j] - '0';
						if (boxes.contains(v))
							return false;
						boxes.add(v);
					}
				}
			}
		}
		return true;
	}

}
