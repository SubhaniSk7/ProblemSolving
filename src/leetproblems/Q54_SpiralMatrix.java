package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q54_SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		int t = 0, b = matrix.length - 1, l = 0, r = matrix[0].length - 1;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int dir = 0;
		while (t <= b && l <= r) {
			if (dir == 0) {// l to r
				for (int i = l; i <= r; ++i)
					result.add(matrix[t][i]);
				dir = 1;
				t++;
			} else if (dir == 1) {// t to b
				for (int i = t; i <= b; ++i)
					result.add(matrix[i][r]);
				dir = 2;
				r--;
			} else if (dir == 2) {// r to l
				for (int i = r; i >= l; --i)
					result.add(matrix[b][i]);
				dir = 3;
				b--;
			} else {// b to t
				for (int i = b; i >= t; --i)
					result.add(matrix[i][l]);
				dir = 0;
				l++;
			}
		}
		return result;
	}
}
