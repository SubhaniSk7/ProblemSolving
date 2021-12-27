package leetproblems;

public class Q868_BinaryGap {
	public int binaryGap(int n) {
		int start = 0, end = 0, max = 0;
		while (n > 0) {
			if (n % 2 == 0) {
				end++;
			} else {
				if (start == 0) {
					start = 1;
					end = 0;
				}
				end++;
				max = Math.max(max, end - start);
				start = 1;
				end = 1;
			}
			n >>= 1;
		}
		return max;
	}
}
