package leetproblems;

import java.util.HashMap;

public class Q1742_MaximumNumberOfBallsInABox {
	public int countBalls(int lowLimit, int highLimit) {
		int max = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = lowLimit; i <= highLimit; ++i) {
			int n = i, sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
			max = Math.max(max, map.get(sum));
		}
		return max;
	}
}
