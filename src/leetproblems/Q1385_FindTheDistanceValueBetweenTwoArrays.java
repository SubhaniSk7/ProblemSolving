package leetproblems;

import java.util.Arrays;

public class Q1385_FindTheDistanceValueBetweenTwoArrays {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr2);
		int count = 0;
		for (int x : arr1) {
			if (inRange(arr2, x - d, x + d))
				count++;
		}
		return count;
	}

	public boolean inRange(int[] nums, int from, int to) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (from <= nums[mid] && nums[mid] <= to) {
				return false;
			} else if (nums[mid] < from) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return true;
	}
}
