package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q07_ReverseInteger {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		int result = reverseInt_1(n);
		System.out.println(result);
	}

	public static int reverseInt_1(int n) {
		boolean neg = false;
		int count = 0;
		if (n < 0) {
			neg = true;
			n = -1 * n;
		}
		int result = 0;
//			2147483647-->Integer.MAX_Value
//			-2147483648-->Integer.MIN_Value
		while (n > 0) {
			count++;

			if (count == 10) {
				int digit = result / 100000000;
				if (digit > 2) {
					return 0;
				} else if (neg && digit == 2 && ((result % 100000000) * 10 + digit) > 147483648) { // for
																									// -ve
					return 0;
				} else if (!neg && digit == 2 && ((result % 100000000) * 10 + digit) > 147483647) { // for +ve
					return 0;
				}
			}
			result = result * 10 + n % 10;
			n /= 10;
		}

		return neg ? (-1 * result) : result;
	}

	// original solution from Leetcode
	public static int reverseInt_2(int x) {
		int result = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if ((result < Integer.MIN_VALUE / 10) || (result == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			result = result * 10 + pop;
		}
		return result;
	}
}
