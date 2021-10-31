package leetproblems;

import java.util.PriorityQueue;

public class Q703_KthLargestElementinaStream {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	int count = 0, position;

	public Q703_KthLargestElementinaStream(int k, int[] nums) {
		position = k;
		for (int x : nums) {
			count++;
			pq.offer(x);
			if (count > k)
				pq.poll();
		}
	}

	public int add(int val) {
		count++;
		pq.offer(val);
		if (count > position)
			pq.poll();
		return pq.peek();
	}
}
