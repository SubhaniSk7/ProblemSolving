package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q283_MoveZeroes {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		Q283_MoveZeroes obj = new Q283_MoveZeroes();

		obj.moveZeroes(nums);
	}

	public void moveZeroes(int[] nums) {
		int n = nums.length, l = 0, r = 0;
		for (l = 0; l < n; ++l) {
			if (nums[l] == 0) {
				r = l + 1;
				while (r < n && nums[r] == 0)
					r++;
				nums[l] = nums[r];
				nums[r] = 0;
			}
		}
	}
}
