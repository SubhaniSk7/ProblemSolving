package leetproblems;

import java.util.PriorityQueue;

public class Q1337_TheKWeakestRowsInAMatrix {
	public int[] kWeakestRows(int[][] mat, int k) {
		int m = mat.length, n = mat[0].length;
		int[] soldiers = new int[m];
		for (int i = 0; i < m; ++i) {// can use binary search for last 1
			int count = 0;
			for (int j = 0; j < n; ++j) {
				if (mat[i][j] == 1)
					count++;
				else
					break;
			}
			soldiers[i] = count;
		}
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0] == 0 ? a[1] - b[1] : a[0] - b[0]));
		for (int i = 0; i < m; ++i)
			pq.offer(new int[] { soldiers[i], i });
		int[] result = new int[k];
		for (int i = 0; i < k; ++i) {
			int[] r = pq.poll();
			result[i] = r[1];
		}
		return result;
	}
}
