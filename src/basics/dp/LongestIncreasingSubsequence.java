package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestIncreasingSubsequence {
	public static int max_ref;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		lis(n, a);
	}

	public static void lis(int n, int[] a) {
		max_ref = 1;
		lis_recursive(a, n);
		System.out.println(max_ref);
	}

	public static int lis_recursive(int[] a, int n) {
		if (n == 1)
			return 1;
		int res, max_ending_here = 1;
		for (int i = 1; i < n; ++i) {
			res = lis_recursive(a, i);
			if (a[i - 1] < a[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}
		max_ref = Math.max(max_ref, max_ending_here);
		return max_ending_here;
	}
}
