package basics.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class TrappingRainWater_2d {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int[][] buildings = new int[m][n];
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; ++j)
				buildings[i][j] = Integer.parseInt(st.nextToken());
		}
		sol(m, n, buildings);
	}

	public static void sol(int m, int n, int[][] buildings) {
		int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };// up,down, left, right

		PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
		// int[] ={row,column,height}
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
					queue.offer(new int[] { i, j, buildings[i][j] });
					visited[i][j] = true;
				}
		int water = 0;
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			for (int[] dir : directions) {
				int i = current[0] + dir[0], j = current[1] + dir[1];
				if (i >= 0 && i < m && j >= 0 && j < n && !visited[i][j]) {
					visited[i][j] = true;
					queue.offer(new int[] { i, j, buildings[i][j] });
					if (buildings[i][j] < current[2])
						water += current[2] - buildings[i][j];
				}
			}
		}
		System.out.println(water);
	}
}
