package leetproblems;

import java.util.Arrays;

public class Q1921_EliminateMaximumNumberOfMonsters {

	public int eliminateMaximum(int[] dist, int[] speed) {
		int n = dist.length, result = 1;
		int[] time = new int[n];
		for (int i = 0; i < n; ++i)
			time[i] = (int) Math.ceil((double) dist[i] / speed[i]);
		Arrays.sort(time);
		for (int i = 1; i < n; ++i) {
			if (time[i] <= i)
				break;
			result++;
		}
		return result;
	}
}
