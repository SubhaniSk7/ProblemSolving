package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1542A_OddSet {

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] nums = new int[2 * n];
			for (int i = 0; i < 2 * n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			solve(n, nums);
		}
	}

	public static void solve(int n, int[] nums) {
		int evens = 0, odds = 0;
		for (int i = 0; i < 2 * n; ++i) {
			if (nums[i] % 2 == 0)
				evens++;
			else
				odds++;
		}
		if (evens != odds)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}