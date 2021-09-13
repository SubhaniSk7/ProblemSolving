package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SingleNumber {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		SingleNumber obj = new SingleNumber();

		System.out.println(obj.singleNumber(nums));
	}

	public int singleNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; ++i)
			ans ^= nums[i];
		return ans;
	}
}
