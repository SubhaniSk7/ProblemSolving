package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubArraySum {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());
		solution_1(n, arr);
		solution_2(n, arr);
		solution_3(n, arr);
	}

	public static void solution_1(int n, int[] arr) {
		int maxSum = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				int sum = 0;
				for (int k = i; k < j; ++k)
					sum += arr[k];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}

	public static void solution_2(int n, int[] arr) {
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			int temp = 0;
			for (int j = i; j < n; ++j) {
				temp += arr[j];
				ans = Math.max(ans, temp);
			}
		}
		System.out.println(ans);
	}

	public static void solution_3(int n, int[] arr) {
		int ans = 0, temp = 0;
		for (int i = 0; i < n; ++i) {
			temp = Math.max(arr[i], temp + arr[i]);
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}

	public static void solution_4(int[] nums) {// with atleast one number
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; ++i) {
			int temp = 0;
			for (int j = i; j < nums.length; ++j) {
				temp += nums[j];
				ans = Math.max(ans, temp);
			}
		}
		System.out.println(ans);
	}

	public static void solution_5(int[] nums) {// with atleast one number
		int ans = Integer.MIN_VALUE;
		int a = 0;
		for (int x : nums) {
			a += x;
			ans = Math.max(ans, a);
			a = Math.max(a, 0);
		}
		System.out.println(ans);
	}

	public static void solution_6(int[] nums) {// with atleast one number
		int n = nums.length;
		int[] pref = new int[n];
		for (int i = 0; i < n; ++i)
			pref[i] = nums[i] + (i == 0 ? 0 : pref[i - 1]);

		int min_so_far = 0, ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			ans = Math.max(ans, pref[i] - min_so_far);
			min_so_far = Math.min(min_so_far, pref[i]);
		}
	}
}
