package leetproblems;

import java.util.PriorityQueue;
import java.util.Stack;

public class Q853_CarFleet {
	public int carFleet(int target, int[] position, int[] speed) {
		int n = position.length;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (-1 * Integer.compare(a[0], b[0])));
		for (int i = 0; i < n; ++i)
			pq.add(new int[] { position[i], speed[i] });

		int[] prev = pq.poll();
		Stack<Double> stack = new Stack<>();
		double t1 = 1.0 * (target - prev[0]) / prev[1];
		stack.add(t1);
		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			double t2 = 1.0 * (target - cur[0]) / cur[1];
			stack.push(t2);
			if (t2 <= t1) {
				stack.pop();
			} else {
				t1 = t2;
			}
		}
		return stack.size();
	}
}
