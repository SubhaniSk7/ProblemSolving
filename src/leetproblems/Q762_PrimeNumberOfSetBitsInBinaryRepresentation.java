package leetproblems;

import java.util.HashSet;

public class Q762_PrimeNumberOfSetBitsInBinaryRepresentation {
	public int countPrimeSetBits(int left, int right) {
		int[] numbers = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };
		HashSet<Integer> primes = new HashSet<>();
		for (int x : numbers)
			primes.add(x);
		int count = 0;
		for (int i = left; i <= right; ++i) {
			int n = i, bits = 0;
			while (n > 0) {
				bits += (n & 1);
				n >>= 1;
			}
			if (primes.contains(bits))
				count++;
		}
		return count;
	}
}
