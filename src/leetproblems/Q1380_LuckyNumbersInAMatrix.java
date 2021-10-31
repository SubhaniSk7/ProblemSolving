package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q1380_LuckyNumbersInAMatrix {
	public List<Integer> luckyNumbers(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		// int[] rMax = new int[m];
		int[] rMin = new int[m];
		int[] cMax = new int[n];
		// int[] cMin = new int[n];

		for (int i = 0; i < m; ++i) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for (int j = 0; j < n; ++j) {
				min = Math.min(min, matrix[i][j]);
				// max = Math.max(max, matrix[i][j]);
			}
			rMin[i] = min;
			// rMax[i] = max;
		}
		for (int j = 0; j < n; ++j) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for (int i = 0; i < m; ++i) {
				// min = Math.min(min, matrix[i][j]);
				max = Math.max(max, matrix[i][j]);
			}
			// cMin[j] = min;
			cMax[j] = max;
		}

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (matrix[i][j] == rMin[i] && matrix[i][j] == cMax[j])
					result.add(matrix[i][j]);
			}
		}
		return result;
	}
}
