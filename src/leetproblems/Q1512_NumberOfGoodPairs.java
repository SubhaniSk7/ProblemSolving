package leetproblems;

import java.util.HashMap;

public class Q1512_NumberOfGoodPairs {
//	public int numIdenticalPairs(int[] nums) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int x : nums)
//			map.put(x, map.getOrDefault(x, 0) + 1);
//		int result = 0;
//		for (int k : map.keySet()) {
//			if (map.get(k) != 1) {
//				int n = map.get(k);
//				result += n * (n - 1) / 2;
//			}
//		}
//		return result;
//	}

	public int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int result = 0;
		for (int x : nums) {
			result += map.getOrDefault(x, 0);
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		return result;
	}
}
