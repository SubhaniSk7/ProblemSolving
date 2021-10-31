package leetproblems;

public class Q204_CountPrimes {
	public int countPrimes(int n) {
		boolean[] primes = new boolean[n];
		for (int i = 2; i * i < n; ++i) {
			if (!primes[i]) {
				for (int j = i; j * i < n; j++)
					primes[i * j] = true; // composite
			}
		}

		int count = 0;
		for (int i = 2; i < n; ++i)
			if (!primes[i])
				count++;

		return count;
	}
}
