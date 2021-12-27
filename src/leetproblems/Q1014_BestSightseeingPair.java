package leetproblems;

public class Q1014_BestSightseeingPair {
	public int maxScoreSightseeingPair(int[] values) {
		int max = 0, v1 = values[0];
		for (int i = 1; i < values.length; ++i) {
			max = Math.max(max, v1 + values[i] - i);
			v1 = Math.max(v1, values[i] + i);
		}
		return max;
	}
}
