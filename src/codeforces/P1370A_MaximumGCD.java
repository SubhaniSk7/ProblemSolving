package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1370A_MaximumGCD {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sol(n);
		}
	}

	public static void sol(int n) {
		int gcd = 1;
		if (n % 2 == 0) {
			gcd = n / 2;
		} else {
			gcd = (n - 1) / 2;
		}
		System.out.println(gcd);// n/2
	}
}
