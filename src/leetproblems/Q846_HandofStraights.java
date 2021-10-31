package leetproblems;

import java.util.TreeMap;

public class Q846_HandofStraights {
	public boolean isNStraightHand(int[] hand, int groupSize) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int x : hand)
			map.put(x, map.getOrDefault(x, 0) + 1);
		while (map.size() > 0) {
			int val = map.firstKey();
			for (int i = val; i < val + groupSize; ++i) {
				if (!map.containsKey(i))
					return false;
				else {
					map.put(i, map.getOrDefault(i, 0) - 1);
					if (map.getOrDefault(i, 0) == 0)
						map.remove(i);
				}
			}
		}
		return true;
	}
}
