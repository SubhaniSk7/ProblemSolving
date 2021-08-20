package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1055A_Metro {
	public static int[][] tracks;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		tracks = new int[2][n + 1];
		for (int i = 0; i < 2; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; ++j)
				tracks[i][j] = Integer.parseInt(st.nextToken());
		}
		boolean present = solve(n, s);
		if (present)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static boolean solve(int n, int s) {
		if (tracks[0][1] == 0 || (tracks[0][s] == 0 && tracks[1][s] == 0)) {
			return false;
		} else {
			int i = 0, j = 1;
			for (i = 0; i < 2; ++i) {
				if (i == 0) {
					for (j = 1; j <= n; ++j) {
//						System.out.println(i + " " + j);
						if (tracks[i][j] == 0)
							continue;
						else if (j == s && tracks[i][j] == 1)
							return true;
						else if (j > s && tracks[i][j] == 1 && tracks[i + 1][j] == 1)
							break;
					}
					if (j > n)
						j = n;
				} else {
					if (j == n && tracks[0][n] == 0)
						return false;
					if (j == n && tracks[1][n] == 0)
						return false;
					for (; j >= s; --j) {
//						System.out.println(i + " " + j);
						if (tracks[i][j] == 0)
							continue;
						else if (j == s && tracks[i][j] == 1)
							return true;
						else if (j < s)
							break;
					}
				}
			}
		}
		return false;
	}
}
