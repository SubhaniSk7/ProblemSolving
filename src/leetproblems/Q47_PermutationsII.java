package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q47_PermutationsII {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		if (nums.length == 0)
			return result;
		permute(nums, 0);
		return result;
	}

	public void permute(int[] nums, int index) {
		if (index == nums.length) {
			ArrayList<Integer> cur = new ArrayList<Integer>();
			for (int x : nums)
				cur.add(x);
			result.add(cur);
			return;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = index; i < nums.length; ++i) {
			if (set.add(nums[i])) {
				swap(nums, index, i);
				permute(nums, index + 1);
				swap(nums, index, i);
			}
		}
	}

	public void swap(int[] nums, int index, int i) {
		int temp = nums[index];
		nums[index] = nums[i];
		nums[i] = temp;
	}
}
