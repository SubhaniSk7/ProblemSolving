package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1475A_OddDivisor {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			long n = Long.parseLong(br.readLine());
			System.out.println(solve(n));
		}
	}

	public static String solve(long n) {
		while (n % 2 == 0)
			n /= 2;
		if (n != 1 && n % 2 == 1)
			return "YES";
		return "NO";
	}
}
