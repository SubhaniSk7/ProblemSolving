package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1360A_MinimalSquare {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			solution(a, b);
		}
	}

	public static void solution(int a, int b) {
		int min = Math.min(a, b), max = Math.max(a, b), minSum = 2 * min, side = Math.max(minSum, max);
		System.out.println(side * side);
	}
}
