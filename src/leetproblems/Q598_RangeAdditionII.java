package leetproblems;

public class Q598_RangeAdditionII {
	public int maxCount(int m, int n, int[][] ops) {
		int min_x = m, min_y = n;
		for (int[] x : ops) {
			min_x = Math.min(min_x, x[0]);
			min_y = Math.min(min_y, x[1]);
		}
		return min_x * min_y;
	}
}
