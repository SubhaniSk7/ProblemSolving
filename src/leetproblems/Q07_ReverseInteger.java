package leetproblems;

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
		if (n < 0) {
			neg = true;
			n = -1 * n;
		}
		long result = 0;
		while (n > 0) {
			result = result * 10 + n % 10;
			n /= 10;
		}
		if (result > Integer.MAX_VALUE)
			return 0;
		if (neg && -1 * result < Integer.MIN_VALUE)
			return 0;
		return neg ? (-1 * (int) result) : (int) result;
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
