package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class LastStoneWeight {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		LastStoneWeight obj = new LastStoneWeight();
		System.out.println(obj.lastStoneWeight(nums));
	}

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
