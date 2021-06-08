package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q162_FindPeakElement {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(findPeakElement(nums));
	}

	public static int findPeakElement(int[] nums) {
		int ans = 0, n = nums.length;
		int L = 0, R = n - 1;
		while (L <= R) {
			int mid = L + (R - L) / 2;
			if (mid - 1 >= 0 && mid + 1 < n && nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
				return mid;
			else if ((mid == 0 && mid == n - 1) || (mid == 0 && nums[mid] > nums[mid + 1])
					|| (mid == n - 1 && nums[mid - 1] < nums[mid])) {
				return mid;
			} else if (mid > 0 && nums[mid - 1] > nums[mid]) {
				ans = mid - 1;
				R = mid - 1;
			} else if (mid + 1 < n && nums[mid] < nums[mid + 1]) {
				ans = mid + 1;
				L = mid + 1;
			}
		}
		return ans;
	}
}
