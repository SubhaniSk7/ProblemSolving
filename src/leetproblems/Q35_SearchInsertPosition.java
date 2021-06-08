package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q35_SearchInsertPosition {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int pos = -1;
		int index = Arrays.binarySearch(nums, target);
		if (index < 0)
			index = ~index;
		System.out.println(index);

		int L = 0, R = nums.length - 1;
		while (L <= R) {
			int mid = L + (R - L + 1) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				pos = mid + 1;
				L = mid + 1;
			} else {
				pos = mid;
				R = mid - 1;
			}
		}
//		pos = index;
		return pos;
	}
}
