package leetproblems;

import java.util.HashMap;
import java.util.HashSet;

public class Q403_FrogJump {
	public boolean canCross(int[] stones) {
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		int n = stones.length;
		for (int i = 0; i < n; ++i)
			map.put(stones[i], new HashSet<Integer>());
		map.get(0).add(1);
		for (int i = 0; i < n - 1; ++i) {
			int stone = stones[i];

			for (int jump : map.get(stone)) {
				int reach = stone + jump;
				if (reach == stones[n - 1])
					return true;
				HashSet<Integer> set = map.getOrDefault(reach, null);
				if (set != null) {
					map.get(reach).add(jump);
					map.get(reach).add(jump + 1);
					if (jump - 1 > 0)
						map.get(reach).add(jump - 1);
				}
			}
		}
		return false;
	}
}
