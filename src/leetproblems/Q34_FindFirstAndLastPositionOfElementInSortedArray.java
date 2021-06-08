package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q34_FindFirstAndLastPositionOfElementInSortedArray {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		int[] ans = searchRange(nums, target);
		System.out.println(ans[0] + " " + ans[1]);
	}

	public static int[] searchRange(int[] nums, int target) {
		int start = -1, end = -1, n = nums.length, L = 0, R = n - 1;
		while (L <= R) {
			int mid = L + (R - L + 1) / 2;
			if (nums[mid] == target) {
				start = mid;
				R = mid - 1;
			} else if (target < nums[mid])
				R = mid - 1;
			else
				L = mid + 1;
		}
		L = 0;
		R = n - 1;
		while (L <= R) {
			int mid = L + (R - L + 1) / 2;
			if (nums[mid] == target) {
				end = mid;
				L = mid + 1;
			} else if (target < nums[mid])
				R = mid - 1;
			else
				L = mid + 1;
		}
		return new int[] { start, end };
	}
}
