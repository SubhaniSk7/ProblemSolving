package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1352C_KthNotDivisibleByn {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
			solve(n, k);
		}
	}

	public static void solve(long n, long k) {
		long start = 1, end = Long.MAX_VALUE;
		long ans = 0;
		while (start <= end) {
			long mid = start + (end - start) / 2;
			if (mid - (mid / n) >= k) {
				ans = mid;
				end = mid - 1;
			} else
				start = mid + 1;
		}
		System.out.println(ans);
	}
}
