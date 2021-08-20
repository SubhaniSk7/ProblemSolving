package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FCTRL_Factorial_TrailingZeroes {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			trailingZeroes(n);
//			factorial(n);
//			BigInteger n = new BigInteger("" + br.readLine());
//			BigInteger val = fact(n);
//			String result = "" + val;
//			int count = 0;
//			for (int i = result.length() - 1; i >= 0; --i)
//				if (result.charAt(i) == '0')
//					count++;
//				else
//					break;
//
//			System.out.println(n + " " + count);
		}
	}

	public static BigInteger fact(BigInteger n) {

		if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		return n.multiply(fact(n.subtract(BigInteger.ONE)));
	}

	public static void factorial(int n) {
		int res[] = new int[100000000];
		res[0] = 1;
		int carry = 0, resize = 1, i, j;
		for (i = 2; i <= n; i++) {
			carry = 0;
			for (j = 0; j < resize; j++) {
				int product = res[j] * i + carry;
				res[j] = product % 10;
				carry = product / 10;
			}
			while (carry != 0) {
				res[resize] = carry % 10;
				carry /= 10;
				resize++;
			}
		}

		int count = 0;
		for (i = 0; i < resize; ++i) {
			if (res[i] == 0)
				count++;
			else
				break;
		}
		System.out.println(count);
	}

	public static void trailingZeroes(int n) {
		int i, count = 0, num = n;
		while (num > 0) {
			if (num % 5 != 0)
				num -= num % 5;
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
	}
}
