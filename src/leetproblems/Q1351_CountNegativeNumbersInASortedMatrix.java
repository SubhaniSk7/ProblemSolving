package leetproblems;

public class Q1351_CountNegativeNumbersInASortedMatrix {
	public int countNegatives(int[][] grid) {
		int rows = grid.length, columns = grid[0].length;
		int count = 0, r = 0, c = columns - 1;
		while (r < rows && c >= 0) {
			if (grid[r][c] < 0) {
				count += rows - r;
				c--;
			} else if (grid[r][c] >= 0)
				r++;
		}
		return count;
	}
}
