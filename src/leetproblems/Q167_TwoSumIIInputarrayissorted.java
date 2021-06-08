package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q167_TwoSumIIInputarrayissorted {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		int[] ans = twoSum(nums, target);
		System.out.println(ans[0] + " " + ans[1]);
	}

	public static int[] twoSum(int[] numbers, int target) {
		int p1 = 0, p2 = 0, L = 0, R = numbers.length - 1;
		while (L <= R) {
			if (numbers[L] + numbers[R] == target) {
				p1 = L + 1;
				p2 = R + 1;
				break;
			} else if (numbers[L] + numbers[R] > target) {
				R--;
			} else
				L++;
		}
		return new int[] { p1, p2 };
	}
}
