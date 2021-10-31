package leetproblems;

public class Q693_BinaryNumberWithAlternatingBits {
	public boolean hasAlternatingBits(int n) {
		int prev = -1;
		while (n > 0) {
			int digit = n % 2;
			if (prev != -1 && prev == digit)
				return false;
			prev = digit;
			n /= 2;
		}
		return true;
	}
}
