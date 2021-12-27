package leetproblems;

public class Q326_PowerOfThree {
//	public boolean isPowerOfThree(int n) {
//		if (n == 0)
//			return false;
//		int p = (int) Math.ceil(Math.log(n) / Math.log(3));
//		return Math.pow(3, p) == n;
//	}

	public boolean isPowerOfThree(int n) {
//		int maxPow = (int)(Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3))));
//		return n>0 && maxPow%n==0;

//		 3^19 = 1162261467, 3^20 = bigger than int
		return n > 0 && 1162261467 % n == 0;
	}
}
