package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P510A_FoxAndSnake {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solution(n, m);
	}

	public static void solution(int n, int m) {
		boolean first = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; ++j) {
				if (i % 2 == 0)
					System.out.print("#");
				else {
					if (first && j == 0)
						System.out.print("#");
					else if (!first && j == m - 1)
						System.out.print("#");
					else
						System.out.print(".");
				}
			}
			if (i % 2 != 0)
				if (first)
					first = false;
				else
					first = true;
			System.out.println();
		}
	}
}
