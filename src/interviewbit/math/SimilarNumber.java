package interviewbit.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimilarNumber {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(solve(A));
	}

	public static String solve(String A) {
		String result = "-1";
		char[] ch = A.toCharArray();
		int n = ch.length, i = 0;
		for (i = n - 1; i > 0; --i) {
			if (ch[i] > ch[i - 1]) {
				break;
			}
		}
		if (i == 0)
			return result;
		int val = ch[i - 1], min = i;
		for (int j = i + 1; j < n; ++j) {
			if (ch[j] > val && ch[j] < ch[min]) {
				min = j;
			}
		}
		char c1 = ch[min];
		ch[min] = ch[i - 1];
		ch[i - 1] = c1;

		Arrays.parallelSort(ch, i, n);
		result = String.valueOf(ch);
		return result;
	}
}
