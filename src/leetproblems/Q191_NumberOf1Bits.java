package leetproblems;

public class Q191_NumberOf1Bits {
	public int hammingWeight(int n) {
		int result = 0;
		for (int i = 31; i >= 0; --i) {
			if ((n & (1 << i)) != 0)
				result++;
		}
		return result;
	}
}
