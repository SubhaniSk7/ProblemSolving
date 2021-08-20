package interviewbit.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class NumberOfLengthNLessThanK {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
		System.out.println(solve(A, B, C));
	}

	public static int solve(int[] A, int B, int C) {
		int result = 0, n = A.length;
		int num = C;
		int cLength = 0;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (num > 0) {
			cLength++;
			digits.add(num % 10);
			num /= 10;
		}
		Collections.reverse(digits);
		if (B > cLength || B == 0)
			return 0;
		else if (B < cLength) {
			if (A[0] == 0 && B != 1)
				result = (int) ((n - 1) * Math.pow(n, B - 1));
			else
				result = (int) Math.pow(n, B);
		} else {
			int[] dp = new int[B + 1];
			int max = 10;
			int[] lower = new int[max + 1];

			for (int i = 0; i < n; ++i) // filling #elements<i --> if A[0] = 0 -->setting i=1 in lower as 1
				lower[A[i] + 1] = 1;
			for (int i = 1; i <= max; ++i)
				lower[i] = lower[i - 1] + lower[i];
			dp[0] = 0;
			boolean flag = true;
			for (int i = 1; i <= B; ++i) {
				int d = lower[digits.get(i - 1)];
				dp[i] = dp[i - 1] * n;
				if (i == 1 && A[0] == 0 && B != 1)
					d = d - 1;
				if (flag)
					dp[i] += d;
				flag = flag & (lower[digits.get(i - 1) + 1] == lower[digits.get(i - 1)] + 1);
			}
			result = dp[B];
		}
		return result;
	}
}
