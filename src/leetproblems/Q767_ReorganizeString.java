package leetproblems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Q767_ReorganizeString {
	public String reorganizeString(String s) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> -1 * (map.get(a) - map.get(b)));
		pq.addAll(map.keySet());

		StringBuilder result = new StringBuilder();
		while (pq.size() > 1) {
			char x = pq.poll();
			char y = pq.poll();

			result.append(x);
			result.append(y);

			map.put(x, map.getOrDefault(x, 0) - 1);
			map.put(y, map.getOrDefault(y, 0) - 1);
			if (map.get(x) > 0)
				pq.offer(x);
			if (map.get(y) > 0)
				pq.offer(y);
		}

		if (!pq.isEmpty()) {
			char x = pq.poll();
			if (map.get(x) > 1)
				return "";
			result.append(x);
		}
		return result.toString();
	}
}
