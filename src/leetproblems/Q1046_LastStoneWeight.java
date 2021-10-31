package leetproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1046_LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int x : stones)
			pq.offer(x);
		while (pq.size() > 1) {
			int y = pq.poll();
			int x = pq.poll();
			if (x < y)
				pq.offer(y - x);
		}
		if (pq.size() == 0)
			return 0;
		return pq.peek();
	}
}
