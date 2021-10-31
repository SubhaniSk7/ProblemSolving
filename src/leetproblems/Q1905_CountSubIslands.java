package leetproblems;

public class Q1905_CountSubIslands {
//	public int countSubIslands(int[][] grid1, int[][] grid2) {
//		int islands = 0;
//		for (int i = 0; i < grid2.length; ++i) {
//			for (int j = 0; j < grid2[0].length; ++j) {
//				if (grid2[i][j] == 1 && dfs(grid1, grid2, i, j)) {
//					islands++;
//				}
//			}
//		}
//		return islands;
//	}

//	public boolean dfs(int[][] grid1, int[][] grid2, int i, int j) {
//		if (i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0)
//			return true;
//
//		grid2[i][j] = 0;
//		boolean valid = true;
//		if (grid1[i][j] == 0)
//			valid = false;
//
//		valid = dfs(grid1, grid2, i + 1, j) && valid;
//		valid = dfs(grid1, grid2, i - 1, j) && valid;
//		valid = dfs(grid1, grid2, i, j + 1) && valid;
//		valid = dfs(grid1, grid2, i, j - 1) && valid;
//		return valid;
//	}

	public int countSubIslands(int[][] grid1, int[][] grid2) {
		int islands = 0;
		for (int i = 0; i < grid2.length; ++i) {
			for (int j = 0; j < grid2[0].length; ++j) {
				if (grid2[i][j] == 1 && grid1[i][j] == 0)
					dfs(grid1, grid2, i, j);
			}
		}
		for (int i = 0; i < grid2.length; ++i) {
			for (int j = 0; j < grid2[0].length; ++j) {
				if (grid2[i][j] == 1) {
					islands++;
					dfs(grid1, grid2, i, j);
				}
			}
		}

		return islands;
	}

	public void dfs(int[][] grid1, int[][] grid2, int i, int j) {
		if (i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0)
			return;
		grid2[i][j] = 0;
		dfs(grid1, grid2, i + 1, j);
		dfs(grid1, grid2, i - 1, j);
		dfs(grid1, grid2, i, j + 1);
		dfs(grid1, grid2, i, j - 1);
	}
}
