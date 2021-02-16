package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P460A_VasyaAndSocks {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solution(n, m);
	}

	public static void solution(int n, int m) {
		int days = n;
		if (n > m) {
			for (int i = 1; i <= n; ++i) {
				if (i % m == 0)
					n++;
			}
			days = n;
		} else if (n == m) {
			days = n + 1;
		} else {
			days = n;
		}
		System.out.println(days);
	}
}
