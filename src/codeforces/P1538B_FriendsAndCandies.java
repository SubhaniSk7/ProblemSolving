package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1538B_FriendsAndCandies {
	public static void main(String[] subhani) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] nums = new int[n];
			for (int i = 0; i < n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			sb.append(solve(n, nums) + "\n");
		}
		System.out.println(sb.toString());

	}

	public static int solve(int n, int[] nums) {
		long total = 0;
		for (int i = 0; i < n; ++i) {
			total += nums[i];
		}
		if (total % n != 0) {
			return -1;
		}
		long avg = total / n;
		int k = 0;
		for (int i = 0; i < n; ++i) {
			if (nums[i] > avg)
				k++;
		}
		return k;
	}
}
