package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpGame {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		JumpGame obj = new JumpGame();
		System.out.println(obj.canJump(nums));
	}

	public boolean canJump(int[] nums) {
		int n = nums.length;
		for (int i = n - 1; i >= 0;) {
			int counter = 1, j = i - 1;
			if (j < 0)
				return true;
			while (j >= 0 && nums[j] < counter) {
				j--;
				counter++;
			}
			if (j < 0)
				return false;
			else
				i = j;
		}
		return true;
	}

	public boolean canJump_1(int[] nums) {
		int n = nums.length, can_reach = 0;
		for (int i = 0; i <= can_reach; ++i) {
			if (i == n - 1)
				return true;

			can_reach = Math.max(can_reach, i + nums[i]);
		}
		return false;
	}
}
