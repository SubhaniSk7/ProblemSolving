package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1004A_SonyaAndHotels {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] x = new int[n];
		for (int i = 0; i < n; ++i)
			x[i] = Integer.parseInt(st.nextToken());
		solution(n, d, x);
	}

	public static void solution(int n, int d, int[] x) {
		int ways = 2;
		for (int i = 0; i < n - 1; ++i) {
			int diff = x[i + 1] - x[i];
			if (diff > 2 * d)
				ways += 2;
			else if (diff == 2 * d)
				ways++;
		}
		System.out.println(ways);
	}
}
