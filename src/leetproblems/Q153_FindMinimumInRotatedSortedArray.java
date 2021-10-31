package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q153_FindMinimumInRotatedSortedArray {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {// check mid and prev is enough as next elements are always >=mid
		int ans = -1, n = nums.length, L = 0, R = n - 1;
		while (L <= R) {
			int mid = L + (R - L) / 2;
			if (mid == 0 && nums[mid] <= nums[R])
				return nums[mid];
			if (mid > 0 && nums[mid - 1] > nums[mid]) {
				return nums[mid];
			} else if (mid < n - 1 && nums[mid] > nums[mid + 1]) {
				return nums[mid + 1];
			} else if (nums[mid] >= nums[R]) {// left sorted
				L = mid + 1;
			} else {// right sorted: [mid]<=[L]
				R = mid - 1;
			}
		}
		return ans;
	}
}
