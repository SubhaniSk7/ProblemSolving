package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q933_NumberofRecentCalls {
	Queue<Integer> q;

	public Q933_NumberofRecentCalls() {
		q = new LinkedList<>();
	}

	public int ping(int t) {
		q.offer(t);
		while (q.peek() < t - 3000)
			q.poll();
		return q.size();
	}
}
