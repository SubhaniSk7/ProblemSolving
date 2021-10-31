package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchInRotatedSortedArray {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		System.out.println(obj.search(nums, target));
	}

	public int search(int[] nums, int target) {
		int n = nums.length, start = 0, end = n - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target)
				return mid;

			else if (nums[mid] >= nums[start]) {// left sorted
				if (nums[start] <= target && target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {// right sorted
				if (nums[mid] < target && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}

		return -1;
	}
}
