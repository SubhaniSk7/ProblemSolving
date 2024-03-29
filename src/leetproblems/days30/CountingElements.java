package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CountingElements {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(solve(nums));
	}

	public static int solve(int[] nums) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int x : nums)
			set.add(x);
		int ans = 0;
		for (int x : nums)
			if (set.contains(x))
				ans++;
		return ans;
	}
}
