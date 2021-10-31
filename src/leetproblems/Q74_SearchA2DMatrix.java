package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q74_SearchA2DMatrix {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()),
				target = Integer.parseInt(st.nextToken());
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; ++j)
				matrix[i][j] = Integer.parseInt(st.nextToken());
		}
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length, row = 0, col = n - 1;
		while (row < m && col >= 0) {
			int ele = matrix[row][col];
			if (ele == target)
				return true;
			else if (target < ele)
				col--;
			else
				row++;
		}
		return false;
	}
}
