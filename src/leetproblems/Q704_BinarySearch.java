package leetproblems;

public class Q704_BinarySearch {
	public int search(int[] nums, int target) {
		return binarySearch(nums, target);
	}

	public int binarySearch(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}
}