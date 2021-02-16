package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P707A_BrainsPhoto {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		char[][] photo = new char[n][m];
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; ++j)
				photo[i][j] = st.nextToken().charAt(0);
		}
		solution(n, m, photo);
	}

	public static void solution(int n, int m, char[][] photo) {
		boolean color = false;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (photo[i][j] == 'C' || photo[i][j] == 'M' || photo[i][j] == 'Y') {
					color = true;
					break;
				}
			}
		}
		if (color)
			System.out.println("#Color");
		else
			System.out.println("#Black&White");
	}
}
