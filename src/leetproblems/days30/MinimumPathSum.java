package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumPathSum {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int[][] grid = new int[m][n];
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; ++j)
				grid[i][j] = Integer.parseInt(st.nextToken());
		}
		MinimumPathSum obj = new MinimumPathSum();
		System.out.println(obj.minPathSum(grid));
	}

	public int minPathSum(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == 0 && j == 0)
					continue;
				else if (i == 0)
					grid[i][j] += grid[i][j - 1];
				else if (j == 0)
					grid[i][j] += grid[i - 1][j];
				else
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
			}
		}
		return grid[m - 1][n - 1];
	}
}
