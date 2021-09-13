package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1359B_NewTheatreSquare {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),
					x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			char[][] pavement = new char[n][m];
			for (int i = 0; i < n; ++i) {
				String s = br.readLine();
				for (int j = 0; j < m; ++j)
					pavement[i][j] = s.charAt(j);
			}
			solve(n, m, x, y, pavement);
		}
	}

	public static void solve(int n, int m, int x, int y, char[][] pavement) {
		int cost = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (pavement[i][j] == '*')
					continue;
				else {
					if (j + 1 < m && pavement[i][j + 1] == '.') {
						cost = cost + Math.min(x + x, y);
						j++;
					} else
						cost = cost + x;
				}
			}
		}
		System.out.println(cost);
	}
}
