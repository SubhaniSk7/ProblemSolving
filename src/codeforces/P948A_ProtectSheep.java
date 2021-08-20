package codeforces;
// website problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P948A_ProtectSheep {
	public static char[][] cell;
	public static String[] pasture;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		cell = new char[n][m];
		for (int i = 0; i < n; ++i) {
			String s = br.readLine();
			for (int j = 0; j < m; ++j)
				cell[i][j] = s.charAt(j);
		}

		boolean save = solve(cell, n, m);
		if (!save) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			print(n, m);
		}
	}

	public static boolean solve(char[][] cell, int n, int m) {
		int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
//				System.out.println(cell[i][j]);
				if (cell[i][j] == 'W') {
//					System.out.println("==");
					for (int r = 0; r < 4; r++) {
						int row = i + dir[r][0], column = j + dir[r][1];
//						System.out.println(row + " " + column);
						if (row >= 0 && row < n && column >= 0 && column < m) {
							if (cell[row][column] == 'S')
								return false;
							else if (cell[row][column] == '.')
								cell[row][column] = 'D';
						}
					}
				} else if (cell[i][j] == '.')
					cell[i][j] = 'D';
			}
		}
		return true;
	}

	public static void print(int n, int m) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j)
				System.out.print(cell[i][j]);
			System.out.println();
		}
	}
}
