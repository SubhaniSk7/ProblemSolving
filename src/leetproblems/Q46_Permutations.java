package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q46_Permutations {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> permute(int[] nums) {
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
		for (int i = index; i < nums.length; ++i) {
			swap(nums, index, i);
			permute(nums, index + 1);
			swap(nums, index, i);
		}
	}

	public void swap(int[] nums, int index, int i) {
		int temp = nums[index];
		nums[index] = nums[i];
		nums[i] = temp;
	}
}
