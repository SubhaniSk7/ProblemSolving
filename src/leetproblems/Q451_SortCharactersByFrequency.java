package leetproblems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Q451_SortCharactersByFrequency {
	public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		PriorityQueue<PairChar> pq = new PriorityQueue<>((a, b) -> -1 * (a.freq - b.freq));
		for (char ch : map.keySet())
			pq.offer(new PairChar(ch, map.get(ch)));
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			PairChar p = pq.poll();
			for (int i = 0; i < p.freq; ++i)
				sb.append(p.ch);
		}
		return sb.toString();
	}
}

class PairChar {
	char ch;
	int freq;

	PairChar(char c, int f) {
		ch = c;
		freq = f;
	}
}
