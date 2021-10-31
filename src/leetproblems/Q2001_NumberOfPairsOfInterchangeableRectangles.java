package leetproblems;

import java.util.HashMap;

public class Q2001_NumberOfPairsOfInterchangeableRectangles {
	public long interchangeableRectangles(int[][] rectangles) {
		HashMap<Double, Long> map = new HashMap<>();
		for (int[] rect : rectangles) {
			double w = rect[0], h = rect[1], val = w / h;
			map.put(val, map.getOrDefault(val, 0L) + 1);
		}
		long result = 0;
		for (long x : map.values())
			result += (x * (x - 1) / 2);
		return result;
	}
}
