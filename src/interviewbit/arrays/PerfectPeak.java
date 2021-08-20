package interviewbit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PerfectPeak {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(perfectPeak(nums));
	}

	public static int perfectPeak(int[] A) {
		int n = A.length;
		for (int i = 1; i < n - 1; ++i) {
			boolean greater = true, smaller = true;
			int ele = A[i];
			for (int j = i - 1; j >= 0; --j) {
				if (ele <= A[j]) {
					greater = false;
					break;
				}
			}
			if (greater) {
				for (int j = i + 1; j < n; ++j) {
					if (ele >= A[j]) {
						smaller = false;
						break;
					}
				}
			}
			if (greater && smaller)
				return 1;
		}

		return 0;
	}
}
//23
//9895 30334 17674 23812 20038 25668 6869 1870 4665 27645 7712 17036 31323 8724 28254 28704 26300 25548 15142 12860 19913 32663 32758

//13
//18757 13932 7377 19955 24085 4967 11841 19630 16945 12624 24627 32440 26309 

//16
//5706 26963 24465 29359 16828 26501 28146 18468 9962 2996 492 11479 23282 19170 15725 6335

//10
//1 2 3 4 5 4 3 2 3 10 
