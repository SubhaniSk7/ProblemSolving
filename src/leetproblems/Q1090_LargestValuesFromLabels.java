package leetproblems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Q1090_LargestValuesFromLabels {
	public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
		int n = labels.length, sum = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> -1 * (a[0] - b[0]));
		for (int i = 0; i < n; ++i)
			pq.offer(new int[] { values[i], labels[i] });
		int i = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (i < numWanted && !pq.isEmpty()) {
			int[] t = pq.poll();
			if (map.getOrDefault(t[1], 0) + 1 <= useLimit) {
				sum += t[0];
				i++;
				map.put(t[1], map.getOrDefault(t[1], 0) + 1);
			}
		}
		return sum;
	}
}
