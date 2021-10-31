package leetproblems;

public class Q231_PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		long x = 1;
		while (x < n)
			x <<= 1;
		return x == n;
	}
}
