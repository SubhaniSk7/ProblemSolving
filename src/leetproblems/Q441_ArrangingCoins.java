package leetproblems;

public class Q441_ArrangingCoins {
//	public int arrangeCoins(int n) {
//		int i = 1, count = 0;
//		for (i = 1; i <= n && n > 0; ++i) {
//			if (n >= i) {
//				count++;
//				n -= i;
//			}
//		}
//		return count;
//	}

	public int arrangeCoins(int n) {
		long start = 1, end = n;
		while (start <= end) {
			long mid = start + (end - start) / 2;
			long val = mid * (mid + 1) / 2;
			if (val == n)
				return (int) mid;
			else if (val > n)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return (int) end;
	}
}
