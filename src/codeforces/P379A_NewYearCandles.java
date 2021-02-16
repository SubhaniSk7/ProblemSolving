package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P379A_NewYearCandles {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solution(n, m);
	}

	public static void solution(int n, int m) {
		int hours = 0;
		for (int i = 1; i <= n; i++) {
			hours = i;
			if (i % m == 0)
				n++;
		}
		System.out.println(hours);
	}
}
