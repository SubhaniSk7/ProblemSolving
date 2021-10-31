package leetproblems;

import java.util.HashMap;
import java.util.HashSet;

public class Q1207_UniqueNumberOfOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x : arr)
			map.put(x, map.getOrDefault(x, 0) + 1);
		HashSet<Integer> set = new HashSet<>(map.values());
		return map.size() == set.size();
	}
}
