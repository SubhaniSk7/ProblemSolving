package leetproblems;

public class Q264_UglyNumberII {
//	public int nthUglyNumber(int n) {
//		PriorityQueue<Long> pq = new PriorityQueue<>();
//		pq.offer(1L);
//		for (int i = 1; i < n; ++i) {
//			long cur = pq.poll();
//			while (!pq.isEmpty() && pq.peek() == cur)
//				cur = pq.poll();
//			pq.offer(cur * 2);
//			pq.offer(cur * 3);
//			pq.offer(cur * 5);
//		}
//		return pq.poll().intValue();
//	}

	public int nthUglyNumber(int n) {
		int[] ugly = new int[n];
		int t2 = 0, t3 = 0, t5 = 0;
		ugly[0] = 1;
		for (int i = 1; i < n; ++i) {
			int min = Math.min(ugly[t2] * 2, Math.min(ugly[t3] * 3, ugly[t5] * 5));
			ugly[i] = min;
			if (min == ugly[t2] * 2)
				t2++;
			if (min == ugly[t3] * 3)
				t3++;
			if (min == ugly[t5] * 5)
				t5++;
		}
		return ugly[n - 1];
	}
}
