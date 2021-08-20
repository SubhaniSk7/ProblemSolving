package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P466C_NumberOfWays {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());
		solve(arr, n);
	}

	public static void solve(int[] arr, int n) {
		long sum = 0;
		for (int i = 0; i < n; ++i)
			sum += arr[i];
		if (sum % 3 == 0) {
			sum /= 3;
			long s = 0;
			int[] count = new int[n];
			for (int i = n - 1; i >= 0; --i) {
				s += arr[i];
				if (s == sum)
					count[i] = 1;
			}
			for (int i = n - 2; i >= 0; --i)
				count[i] += count[i + 1];
			long ans = 0;
			s = 0;
			for (int i = 0; i < n - 2; ++i) {
				s += arr[i];
				if (s == sum)
					ans += count[i + 2];
			}
			System.out.println(ans);
		} else
			System.out.println(0);
	}

}
