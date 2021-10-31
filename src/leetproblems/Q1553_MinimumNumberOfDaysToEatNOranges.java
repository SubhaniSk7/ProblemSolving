package leetproblems;

import java.util.HashMap;

public class Q1553_MinimumNumberOfDaysToEatNOranges {
	HashMap<Integer, Integer> map = new HashMap<>();

	public int minDays(int n) {// recursive memoization
		return rec(n);
	}

	public int rec(int n) {
		if (map.containsKey(n))
			return map.get(n);
		if (n <= 1)
			return n;

		int v1 = n % 2 + rec(n / 2);
		int v2 = n % 3 + rec(n / 3);
		int val = 1 + Math.min(v1, v2);
		map.put(n, val);
		return val;
	}

//	public int minDays(int n) {// memory limit Exceeded
//		int[] dp = new int[n + 1];
//		dp[0] = 0;
//		dp[1] = 1;
//		for (int i = 2; i <= n; ++i)
//			dp[i] = 1 + Math.min(i % 2 + dp[i / 2], i % 3 + dp[i / 3]);
//		return dp[n];
//	}
}
