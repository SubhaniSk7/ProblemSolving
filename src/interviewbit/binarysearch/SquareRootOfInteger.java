package interviewbit.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRootOfInteger {
	public static void main(String subhani[]) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		System.out.println(sqrt(A));
	}

	public static int sqrt(int A) {
		int result = 0;
		long start = 0, end = A;
		while (start <= end) {
			long mid = start + (end - start) / 2;
			if (mid * mid == A) {
				return (int) mid;
			} else if (mid * mid < A) {
				start = mid + 1;
				result = (int) mid;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}
}
