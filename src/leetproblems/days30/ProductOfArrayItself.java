package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProductOfArrayItself {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		ProductOfArrayItself obj = new ProductOfArrayItself();
		int[] result = obj.productExceptSelf(nums);
	}

	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int[] pref = new int[n], suff = new int[n];
		for (int i = 0; i < n; ++i)
			pref[i] = nums[i] * (i == 0 ? 1 : pref[i - 1]);
		for (int i = n - 1; i > 0; --i)
			suff[i] = nums[i] * (i == n - 1 ? 1 : suff[i + 1]);

		for (int i = 0; i < n; ++i) {
			int l = 1, r = 1;
			if (i - 1 >= 0)
				l = pref[i - 1];
			if (i + 1 < n)
				r = suff[i + 1];
			result[i] = l * r;
		}

		return result;
	}
}
