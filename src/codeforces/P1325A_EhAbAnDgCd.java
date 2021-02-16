package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1325A_EhAbAnDgCd {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		int a = 1, b = n - 1;
		System.out.println(a + " " + b);
	}

//	public static int gcd(int a, int b) {
//		if (a == 0)
//			return b;
//		if (b == 0)
//			return a;
//
//		if (a > b)
//			return gcd(b, a % b);
//		return gcd(a, b % a);
//	}
//
//	public static int lcm(int a, int b) {
//		return (a * b) / gcd(a, b);
//	}
}
