package leetproblems;

public class Q1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers {
	public int[] getNoZeroIntegers(int n) {
		for (int i = 1; i <= n / 2; ++i) {
			if (valid(i) && valid(n - i))
				return new int[] { i, n - i };
		}
		return new int[] { 1, 1 };
	}

	public boolean valid(int n) {
		while (n > 0) {
			if (n % 10 == 0)
				return false;
			n /= 10;
		}
		return true;
	}
}
