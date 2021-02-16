package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1294A_CollectingCoins {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
					c = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			solution(a, b, c, n);
		}
	}

	public static void solution(int a, int b, int c, int n) {
		int max = Math.max(a, Math.max(b, c));
		n = n - ((max - a) + (max - b) + (max - c));
//		System.out.println(max + " " + n);
		if (n % 3 == 0 && n >= 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
