package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1433B_YetAnotherBookshelf {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solve(n, arr);
		}
	}

	public static void solve(int n, int[] arr) {
		int left = -1, right = n;
		for (int i = 0; i < n; ++i) {
			if (left == -1 && arr[i] == 1)
				left = i;
			if (arr[i] == 1)
				right = i;
		}
		int result = 0;
		for (int i = left; i <= right; ++i) {
			if (arr[i] == 0)
				result++;
		}
		System.out.println(result);
	}
}
