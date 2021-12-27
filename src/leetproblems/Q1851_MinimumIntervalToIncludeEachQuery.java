package leetproblems;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Q1851_MinimumIntervalToIncludeEachQuery {
	public int[] minInterval(int[][] intervals, int[] queries) {
		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
		int n = intervals.length, q = queries.length, i = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int x : queries)
			map.put(x, -1);
		int[] result = new int[q];
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		for (int query : map.keySet()) {
			while (i < n && intervals[i][0] <= query) {
				int l = intervals[i][0], r = intervals[i][1];
				pq.offer(new int[] { r - l + 1, r });
				i++;
			}
			while (!pq.isEmpty() && pq.peek()[1] < query)
				pq.poll();
			if (!pq.isEmpty())
				map.put(query, pq.peek()[0]);
		}
		for (i = 0; i < q; ++i)
			result[i] = map.get(queries[i]);
		return result;
	}
}
