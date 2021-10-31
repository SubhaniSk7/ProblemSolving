package leetproblems;

import java.util.HashMap;

public class Q560_SubarraySumEqualsK {

	public int subarraySum(int[] nums, int k) {
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] sum = new int[n + 1];
		sum[0] = 0;
		for (int i = 1; i <= n; ++i)
			sum[i] = nums[i - 1] + sum[i - 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = i - 1; j >= 0; --j) {
				int s = sum[i] - sum[j];
				map.put(s, map.getOrDefault(s, 0) + 1);
			}
		}
		return map.getOrDefault(k, 0);
	}

	public int subarraySum_1(int[] nums, int k) {
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int ans = 0, pref = 0;
		for (int i = 0; i < n; ++i) {
			pref += nums[i];
			int need = pref - k;
			ans += map.getOrDefault(need, 0);
			map.put(pref, map.getOrDefault(pref, 0) + 1);
		}
		return ans;
	}
}
