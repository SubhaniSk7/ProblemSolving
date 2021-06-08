package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q29_DivideTwoIntegers {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
//		int dividend = Integer.parseInt(st.nextToken());
		long dividend = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
//		int divisor = Integer.parseInt(st.nextToken());
		long divisor = Long.parseLong(st.nextToken());

		System.out.println(divide(dividend, divisor));
	}

	public static int divide(long dividend, long divisor) {
		int sign = ((divisor < 0) ^ (dividend < 0)) ? -1 : 1;

		divisor = Math.abs(divisor);
		dividend = Math.abs(dividend);
		long temp = 0, quotient = 0;
		for (int i = 31; i >= 0; i--) {
//			System.out.println(divisor << i);
			if ((temp + (divisor << i)) <= dividend) {// checking if binary of divisor is less than dividend
				temp += divisor << i; // adding
				quotient |= 1L << i; // ORing
//				System.out.println(i + "::" + temp + " --> " + quotient);
			}
		}
		if (sign * quotient > 2147483647)
			return 2147483647;
		return (int) (sign * quotient);
	}
}
