package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1374A_RequiredRemainder {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
					n = Integer.parseInt(st.nextToken());
			solution(x, y, n);
		}
	}

	public static void solution(int x, int y, int n) {
		if (n - (n % x) + y <= n)
			System.out.println(n - (n % x) + y);
		else
			System.out.println(n - (n % x) - x + y);
	}
}
