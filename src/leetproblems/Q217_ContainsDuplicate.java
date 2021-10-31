package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q217_ContainsDuplicate {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		Q217_ContainsDuplicate obj = new Q217_ContainsDuplicate();
		System.out.println(obj.containsDuplicate(nums));
	}

	public boolean containsDuplicate(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < n - 1; ++i) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}

	public boolean containsDuplicate_1(int[] nums) {
		int n = nums.length;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; ++i) {
			if (set.contains(nums[i]))
				return true;
			set.add(nums[i]);
		}
		return false;
	}
}
