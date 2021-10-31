package leetproblems;

import java.util.HashMap;

public class Q287_FindTheDuplicateNumber {
	public int findDuplicate_1(int[] nums) {// floyd cycle detection algo
		if (nums.length > 1) {
			int slow = nums[0];
			int fast = nums[nums[0]];
			while (slow != fast) {
				slow = nums[slow];
				fast = nums[nums[fast]];
			}
			fast = 0;
			while (slow != fast) {
				slow = nums[slow];
				fast = nums[fast];
			}
			return slow;
		}
		return -1;
	}

	public int findDuplicate_2(int[] nums) {// binary search--> pigeon hole principle
		int start = 0, end = nums.length - 1, count = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			count = 0;
			for (int x : nums) {
				if (x <= mid)
					count++;
			}
			if (count <= mid)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return start;
	}

	public int findDuplicate_3(int[] nums) {// general map
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			if (map.get(i) > 1)
				return i;
		}
		return 0;
	}
}
