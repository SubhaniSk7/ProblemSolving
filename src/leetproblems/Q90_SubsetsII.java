package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q90_SubsetsII {
	List<List<Integer>> result = new ArrayList<>();
	HashSet<ArrayList<Integer>> set = new HashSet<>();

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		rec(nums, 0, new ArrayList<Integer>());

		for (ArrayList<Integer> al : set)
			result.add(al);
		return result;
	}

	public void rec(int[] nums, int i, ArrayList<Integer> al) {
		if (i == nums.length) {
			set.add(new ArrayList<Integer>(al));
			return;
		}

		al.add(nums[i]);
		rec(nums, i + 1, al);
		al.remove(al.size() - 1);
		rec(nums, i + 1, al);
	}
}
