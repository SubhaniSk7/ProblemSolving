package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1520B_OrdinaryNumbers {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solve(n);
		}
	}

	public static void solve(int n) {
		int result = 0;
		for (int power = 1; power <= n; power = power * 10 + 1) {
			for (int d = 1; d <= 9; ++d) {
				if (d * power <= n)
					result++;
			}
		}
		System.out.println(result);
	}
}
