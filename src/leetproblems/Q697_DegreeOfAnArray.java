package leetproblems;

import java.util.HashMap;

public class Q697_DegreeOfAnArray {
	public int findShortestSubArray(int[] nums) {
		HashMap<Integer, PairIndex> map = new HashMap<>();
		int n = nums.length, result = n + 1, maxDegree = 0, freq = 0;
		for (int i = 0; i < n; ++i) {
			if (map.getOrDefault(nums[i], null) == null) {
				map.put(nums[i], new PairIndex(1, i, i));
				freq = 1;
			} else {
				PairIndex p = map.get(nums[i]);
				p.freq++;
				p.last = i;
				map.put(nums[i], p);
				freq = p.freq;
			}
			maxDegree = Math.max(maxDegree, freq);
		}

		for (int k : map.keySet()) {
			PairIndex p = map.get(k);
			if (p.freq == maxDegree)
				result = Math.min(result, p.last - p.first + 1);
		}
		return result;
	}
}

class PairIndex {
	int freq, first, last;

	PairIndex(int count, int l, int r) {
		freq = count;
		first = l;
		last = r;
	}
}