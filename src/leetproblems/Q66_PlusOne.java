package leetproblems;

public class Q66_PlusOne {
	public int[] plusOne(int[] digits) {
		int n = digits.length, carry = 0, sum = 0;
		for (int i = n - 1; i >= 0; --i) {
			if (i == n - 1)
				sum = digits[i] + 1 + carry;
			else
				sum = digits[i] + carry;
			digits[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry > 0) {
			int[] result = new int[n + 1];
			result[0] = carry;
			for (int i = 1; i < n; ++i)
				result[i] = digits[i];
			return result;
		}
		return digits;
	}

	public int[] plusOne_1(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; --i) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[n + 1];
		result[0] = 1;
		for (int i = 1; i < n; ++i)
			result[i] = digits[i];
		return result;
	}
}
