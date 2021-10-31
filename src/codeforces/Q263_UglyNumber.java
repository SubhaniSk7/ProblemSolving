package codeforces;

public class Q263_UglyNumber {
	public boolean isUgly(int n) {
		if (n <= 0)
			return false;
		int[] num = { 2, 3, 5 };
		for (int i : num) {
			while (n % i == 0)
				n /= i;
		}
		return n == 1;
	}
}
