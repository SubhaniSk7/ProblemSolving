package leetproblems;

import java.util.PriorityQueue;

public class Q1845_SeatReservationManager {
	PriorityQueue<Integer> pq;

	public Q1845_SeatReservationManager(int n) {
		pq = new PriorityQueue<Integer>();
		for (int i = 1; i <= n; ++i)
			pq.offer(i);
	}

	public int reserve() {
		return pq.poll();
	}

	public void unreserve(int seatNumber) {
		pq.add(seatNumber);
	}
}
