package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1337A_IchihimeAndTriangle {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
					c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			solution(a, b, c, d);
		}
	}

	public static void solution(int a, int b, int c, int d) {
		System.out.println(Math.max(a, b) + " " + Math.max(b, c) + " " + Math.min(c, d));// or print b,c,c
	}
}
