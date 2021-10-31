package leetproblems;

public class Q807_MaxIncreaseToKeepCitySkyline {
//	public int maxIncreaseKeepingSkyline(int[][] grid) {
//		int rows = grid.length, columns = grid[0].length;
//		int[] rMax = new int[rows], cMax = new int[columns];
//
//		for (int i = 0; i < rows; ++i) {
//			int max = Integer.MIN_VALUE;
//			for (int j = 0; j < columns; ++j)
//				max = Math.max(max, grid[i][j]);
//			rMax[i] = max;
//		}
//
//		for (int i = 0; i < columns; ++i) {
//			int max = Integer.MIN_VALUE;
//			for (int j = 0; j < rows; ++j)
//				max = Math.max(max, grid[j][i]);
//			cMax[i] = max;
//		}
//		int result = 0;
//		for (int i = 0; i < rows; ++i) {
//			for (int j = 0; j < columns; ++j) {
//				if (grid[i][j] == rMax[i] || grid[i][j] == cMax[j])
//					continue;
//				else {
//					int min = Math.min(rMax[i], cMax[j]);
//					result += (min - grid[i][j]);
//				}
//			}
//		}
//		return result;
//	}

	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int rows = grid.length, columns = grid[0].length;
		int[] rMax = new int[rows], cMax = new int[columns];

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				rMax[i] = Math.max(rMax[i], grid[i][j]);
				cMax[j] = Math.max(cMax[j], grid[i][j]);
			}
		}
		int result = 0;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				if (grid[i][j] == rMax[i] || grid[i][j] == cMax[j])
					continue;
				else {
					int min = Math.min(rMax[i], cMax[j]);
					result += min - grid[i][j];
				}
			}
		}
		return result;
	}
}
