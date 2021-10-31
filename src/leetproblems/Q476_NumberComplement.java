package leetproblems;

public class Q476_NumberComplement {
	public int findComplement(int num) {
		int result = 0, power = 1;
		while (num > 0) {
			int digit = ((num % 2) ^ 1);
			result += digit * power;
			power *= 2;
			num >>= 1;
		}
		return result;
	}
}
