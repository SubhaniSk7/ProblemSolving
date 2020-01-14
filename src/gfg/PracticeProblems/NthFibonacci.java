package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthFibonacci {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		long[] result = new long[t];
		int i = 0;
		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			result[i++] = nth(n);
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	static long nth(int n) {
		long a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (long i = 2; i <= n; i++) {
			c = (a + b) % 1000000007;
			a = b;
			b = c;
		}
		return b % 1000000007;
	}
}
