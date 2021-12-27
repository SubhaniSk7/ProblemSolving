package leetproblems;

import java.util.Arrays;
import java.util.HashSet;

public class Q1175_PrimeArrangements {
	public int numPrimeArrangements(int n) {
		int p = 0, mod = 1000000007;
		HashSet<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
		for (int i = 1; i <= n; ++i) {
			if (set.contains(i))
				p++;
		}
		long f1 = 1, f2 = 1;
		for (int i = 2; i <= p; ++i)
			f1 = (f1 * i) % mod;
		for (int i = 2; i <= n - p; ++i)
			f2 = (f2 * i) % mod;
		return (int) ((f1 * f2) % mod);
	}
}
