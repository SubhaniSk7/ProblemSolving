package leetproblems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Q347_TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x : nums)
			map.put(x, map.getOrDefault(x, 0) + 1);
		for (int x : map.keySet()) {
			pq.offer(new int[] { map.get(x), x });
			if (pq.size() > k)
				pq.poll();
		}
		int[] result = new int[pq.size()];
		int i = 0;
		while (!pq.isEmpty()) {
			int[] a = pq.poll();
			result[i++] = a[1];
		}
		return result;
	}
}
