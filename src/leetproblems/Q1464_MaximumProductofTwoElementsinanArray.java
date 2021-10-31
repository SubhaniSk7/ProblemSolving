package leetproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1464_MaximumProductofTwoElementsinanArray {
	public int maxProduct(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int x : nums)
			pq.offer(x);
		int x = pq.poll(), y = pq.poll();
		return (x - 1) * (y - 1);
	}
}
