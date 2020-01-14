package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample {
	static long[] facts;

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		facts = new long[n + 1];
		System.out.println(facto(n));
	}

	static long factorial(int n) {
		if (n == 1)
			return 1;
		return (n * (factorial(n - 1) % 1000000007)) % 1000000007;
	}

	static long facto(int n) {
		int i;
		facts[0] = 1;
		facts[1] = 1;
		for (i = 2; i <= n; i++) {
			facts[i] = (i * facts[i - 1]) % 1000000007;
			// System.out.println(i + ":" + facts[i]);
		}

		return facts[n];
	}
}
