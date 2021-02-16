package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1154A_RestoringThreeNumbers {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.MIN_VALUE;
		int[] nums = new int[4];
		for (int i = 0; i < 4; ++i) {
			nums[i] = Integer.parseInt(st.nextToken());
			sum = Math.max(sum, nums[i]);
		}
		solution(nums, sum);
	}

	public static void solution(int[] nums, int sum) {
		for (int i = 0; i < 4; ++i)
			if (nums[i] != sum)
				System.out.print(sum - nums[i] + " ");
		System.out.println();
	}
}
