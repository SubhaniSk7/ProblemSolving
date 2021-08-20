package interviewbit.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInteger {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(reverse(n));
	}

	public static int reverse(int A) {
		int result = 0;
		long num = 0;
		if (A < 0) {
			result = -1;
			A *= -1;
		} else
			result = 1;
		long n = A;
		while (n > 0) {
			int rem = (int) (n % 10);
			num = num * 10 + rem;
			if (num >= Integer.MAX_VALUE) {
				num = 0;
				break;
			}
			n /= 10;
		}

		return (int) (result * num);
	}
}
