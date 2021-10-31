package leetproblems;

import java.util.PriorityQueue;

public class Q414_ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int k = 3, max = Integer.MIN_VALUE;
		for (int x : nums) {
			max = Math.max(max, x);
			if (pq.isEmpty())
				pq.offer(x);
			else if (!pq.isEmpty() && !pq.contains(x))
				pq.offer(x);

			if (pq.size() > k)
				pq.poll();
		}
		System.out.println(pq.toString());
		if (pq.size() < k)
			return max;
		return pq.peek();
	}
}
