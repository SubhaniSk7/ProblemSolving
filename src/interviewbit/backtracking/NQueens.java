package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NQueens {
	List<List<String>> result = new ArrayList<>();

	public static void main(String[] subhani) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		NQueens obj = new NQueens();
		System.out.println(obj.solveNQueens(n).toString());
	}

	public List<List<String>> solveNQueens(int n) {
		int[][] board = new int[n][n];
		solve(board, n, 0);
		return result;
	}

	public boolean solve(int[][] board, int n, int col) {
		if (col >= n) {
			ArrayList<String> al = new ArrayList<>();
			for (int i = 0; i < n; ++i) {
				String s = "";
				for (int j = 0; j < n; ++j)
					s += (board[i][j] == 1 ? "Q" : ".");
				al.add(s);
			}
			result.add(al);
//			return true;
		}
		for (int i = 0; i < n; ++i) {
			if (valid(board, i, col)) {
				board[i][col] = 1;
//				print(board, n);
				if (solve(board, n, col + 1))
					return true;
				board[i][col] = 0;
			}
		}
		return false;
	}

	public boolean valid(int[][] board, int r, int c) {
		for (int i = 0; i < c; ++i) {// left
			if (board[r][i] == 1)
				return false;
		}

		for (int i = r, j = c; i >= 0 && j >= 0; --i, --j) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = r, j = c; i < board.length && j >= 0; ++i, --j) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}

	public void print(int[][] board, int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}