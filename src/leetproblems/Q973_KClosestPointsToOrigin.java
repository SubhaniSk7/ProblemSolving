package leetproblems;

import java.util.PriorityQueue;

public class Q973_KClosestPointsToOrigin {
	public int[][] kClosest(int[][] points, int k) {

		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> -1 * (a[0] - b[0]));
		for (int i = 0; i < points.length; ++i) {
			int x = points[i][0], y = points[i][1];
			int d = x * x + y * y;
			pq.offer(new int[] { d, x, y });
			if (pq.size() > k)
				pq.poll();
		}
		int[][] result = new int[pq.size()][2];
		int i = 0;
		while (!pq.isEmpty()) {
			int[] p = pq.poll();
			result[i][0] = p[1];
			result[i][1] = p[2];
			i++;
		}
		return result;
	}
}
