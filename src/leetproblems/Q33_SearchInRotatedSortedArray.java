package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q33_SearchInRotatedSortedArray {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {// here every element is unique
		int L = 0, R = nums.length - 1;
		while (L <= R) {
			int mid = L + (R - L + 1) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[L] <= nums[mid]) {// Left Half sorted
				if (nums[L] <= target && target <= nums[mid])
					R = mid - 1;
				else
					L = mid + 1;
			} else {// Right half sorted
				if (nums[mid] <= target && target <= nums[R])
					L = mid + 1;
				else
					R = mid - 1;
			}
		}
		return -1;
	}
}
