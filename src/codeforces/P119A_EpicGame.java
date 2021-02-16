package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P119A_EpicGame {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
				n = Integer.parseInt(st.nextToken());
		solution(a, b, n);
	}

	public static void solution(int a, int b, int n) {
		boolean turn = true;
		while (n >= 0) {
			int value = 0;
			if (turn) {
				value = gcd(a, n);
				if (value > n) {
					System.out.println(1);
					break;
				}
				turn = false;
			} else {
				value = gcd(b, n);
				if (value > n) {
					System.out.println(0);
					break;
				}
				turn = true;
			}
			n -= value;
		}
	}

	public static int gcd(int x, int y) {
		if (x == 0)
			return y;
		if (y == 0)
			return x;
		if (x == y)
			return x;
		if (x > y)
			return gcd(x % y, y);
		return gcd(x, y % x);
	}
}
