package leetproblems;

public class Q154_FindMinimumInRotatedSortedArrayII {
	public int findMin(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else if (nums[mid] < nums[end]) {
				end = mid;
			} else {// nums[start] <= nums[mid] <= nums[end]
				end--;
			}
		}
		return nums[start];
	}
}
