package leetproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q378_KthSmallestElementInaSortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int m = matrix.length, n = matrix[0].length;
		for (int r = 0; r < m; ++r) {
			for (int c = 0; c < n; ++c) {
				pq.offer(matrix[r][c]);
				if (pq.size() > k)
					pq.poll();
			}
		}
		return pq.peek();
	}
}
