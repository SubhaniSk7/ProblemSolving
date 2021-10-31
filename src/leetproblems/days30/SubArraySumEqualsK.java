package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SubArraySumEqualsK {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		SubArraySumEqualsK obj = new SubArraySumEqualsK();

		System.out.println(obj.subarraySum(nums, k));
	}

	public int subarraySum(int[] nums, int k) {
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] pref = new int[n];
		for (int i = 0; i < n; ++i)
			pref[i] = nums[i] + (i == 0 ? 0 : pref[i - 1]);

		map.put(0, 1);
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			int need = pref[i] - k;
			ans += map.getOrDefault(need, 0);
			map.put(pref[i], map.getOrDefault(pref[i], 0) + 1);
		}
		return ans;
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

	public int subarraySum_2(int[] nums, int k) {// bruteforce
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
}
