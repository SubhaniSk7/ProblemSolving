package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1490A_DenseArray {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] nums = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			sb.append(solve(n, nums) + "\n");
		}
		System.out.println(sb.toString());
	}

	public static int solve(int n, int[] nums) {
		int prev = nums[0];
		int result = 0;
		for (int i = 1; i < nums.length; ++i) {
			int min = Math.min(prev, nums[i]);
			int max = Math.max(prev, nums[i]);
			while (min * 2 < max) {
				result++;
				min *= 2;
			}
			prev = nums[i];
		}
		return result;
	}
}
