package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1551A_PolycarpAndCoins {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sol(n);
		}
	}

	public static void sol(int n) {
		int c1 = n / 3, c2 = n / 3;
		if (n % 3 == 0) {
			c1 = n / 3;
			c2 = n / 3;
		} else if (n % 3 == 1) {
			c1 = c1 + 1;
		} else if (n % 3 == 2) {
			c2 = c2 + 1;
		}

		System.out.println(c1 + " " + c2);
	}
}
