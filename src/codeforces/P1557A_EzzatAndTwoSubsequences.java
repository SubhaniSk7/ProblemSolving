package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1557A_EzzatAndTwoSubsequences {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			avg(arr, n);
		}
	}

	public static void avg(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		double sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += arr[i];
			max = Integer.max(max, arr[i]);
		}
		double ans = max + ((sum - max) / (n - 1));
		System.out.println(ans);
	}
}
