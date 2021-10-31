package leetproblems;

import java.util.ArrayList;
import java.util.HashMap;

public class Q904_FruitIntoBaskets {
	public int totalFruit(int[] fruits) {
		int n = fruits.length, max = 0;
		int l = 0;
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int r = 0; r < n; ++r) {
			if (!al.contains(fruits[r]))
				al.add(fruits[r]);
			map.put(fruits[r], r);
			if (al.size() > 2) {
				int f = al.get(0), s = al.get(1);
				if (map.get(f) < map.get(s)) {
					int min = map.get(f);
					map.remove(f);
					l = min + 1;
					al.remove(0);
				} else {
					int min = map.get(s);
					map.remove(s);
					l = min + 1;
					al.remove(1);
				}
			}
			max = Math.max(max, r - l + 1);
		}
		return max;
	}
}
