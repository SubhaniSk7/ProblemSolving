package leetproblems;

import java.util.Arrays;

public class Q787_CheapestFlightsWithinKStops {
	int[] cost;

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		cost = new int[n];
		bellman(n, flights, src, k);

		return (cost[dst] == 1000009) ? -1 : cost[dst];
	}

	public void bellman(int n, int[][] flights, int src, int k) {
		Arrays.fill(cost, 1000009);
		cost[src] = 0;
		for (int i = 0; i <= k; ++i) { // instead of n , run for k
			int[] temp = cost.clone();
			for (int[] f : flights) {
				int u = f[0], v = f[1], p = f[2];
				if (temp[v] > cost[u] + p)
					temp[v] = cost[u] + p;
			}
			cost = temp.clone();
		}
		// System.out.println(Arrays.toString(cost));
	}
}
