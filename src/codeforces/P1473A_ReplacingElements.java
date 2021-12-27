package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1473A_ReplacingElements {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] nums = new int[n];
			for (int i = 0; i < n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			solve(n, d, nums);
		}
	}

	public static void solve(int n, int d, int[] nums) {
		Arrays.sort(nums);
		if (nums[0] + nums[1] <= d || nums[n - 1] <= d)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
