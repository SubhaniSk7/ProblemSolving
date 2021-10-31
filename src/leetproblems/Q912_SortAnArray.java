package leetproblems;

import java.util.Arrays;

public class Q912_SortAnArray {
	public int[] sortArray(int[] nums) {
		Arrays.sort(nums);
		// mergeSort(nums, 0, nums.length - 1);
		return nums;
	}

	public void mergeSort(int[] nums, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(nums, start, mid);
			mergeSort(nums, mid + 1, end);
			merge(nums, start, mid, end);
		}
	}

	public void merge(int[] nums, int start, int mid, int end) {
		int l = mid - start + 1, r = end - mid, i = 0, j = 0, k = start;
		int[] left = new int[mid - start + 1];
		int[] right = new int[end - mid];

		for (i = 0; i < l; ++i)
			left[i] = nums[i + start];
		for (i = 0; i < r; ++i)
			right[i] = nums[mid + 1 + i];

		i = 0;
		while (i < l || j < r) {
			if (j == r || (i < l && left[i] < right[j]))
				nums[k++] = left[i++];
			else
				nums[k++] = right[j++];
		}
	}
}
