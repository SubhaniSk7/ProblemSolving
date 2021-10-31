package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q18_4Sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
		Set<ArrayList<Integer>> set = new HashSet<>();
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				int l = j + 1;
				int r = n - 1;
				while (l < r) {
					int sum = nums[i] + nums[j] + nums[l] + nums[r];
					if (sum == target) {
						ArrayList<Integer> al = new ArrayList<>();
						al.add(nums[i]);
						al.add(nums[j]);
						al.add(nums[l]);
						al.add(nums[r]);
						set.add(al);
						l++;
						r--;
					} else if (sum < target)
						l++;
					else
						r--;
				}
			}
		}
		List<List<Integer>> result = new ArrayList<>();
		result.addAll(set);
		return result;
	}
}
