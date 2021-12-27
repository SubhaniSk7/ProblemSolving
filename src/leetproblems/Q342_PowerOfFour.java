package leetproblems;

public class Q342_PowerOfFour {
//	public boolean isPowerOfFour(int n) {
//		while (n > 1) {
//			if (n % 4 > 0)
//				return false;
//			n /= 4;
//		}
//		return n == 1;
//	}

	public boolean isPowerOfFour(int n) {
		return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
	}
}
