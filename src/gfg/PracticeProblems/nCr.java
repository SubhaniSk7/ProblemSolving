package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class nCr {

	static BigInteger[] facts;

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		BigInteger[] result = new BigInteger[t];
		int i = 0;
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());

			result[i++] = combinations(n, r);
		}

		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	static BigInteger facto(int n) {
		int i;
		facts[0] = BigInteger.ONE;
		facts[1] = BigInteger.ONE;
		for (i = 2; i <= n; i++)
			facts[i] = facts[i - 1].multiply(new BigInteger("" + i));

		return facts[n];
	}

	static BigInteger combinations(int n, int r) {

		int big = (n >= r) ? n : r;
		facts = new BigInteger[big + 1];

		if (r > n)
			return BigInteger.ZERO;

		facto(big);// dynamic programming filling factorials

		BigInteger numerator = facts[n];
		BigInteger denomerator = facts[n - r].multiply(facts[r]);

		return numerator.divide(denomerator).mod(new BigInteger("1000000007"));
	}
}
