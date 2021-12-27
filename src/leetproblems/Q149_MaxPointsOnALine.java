package leetproblems;

import java.util.HashMap;

public class Q149_MaxPointsOnALine {
	public int maxPoints(int[][] points) {
		if (points.length <= 1)
			return points.length;
		int result = 0;
		for (int i = 0; i < points.length; ++i) {
			int same = 1;
			HashMap<Double, Integer> map = new HashMap<>();
			for (int j = i + 1; j < points.length; ++j) {
				double x1 = points[i][0], y1 = points[i][1], x2 = points[j][0], y2 = points[j][1];
				if (x1 == x2 && y1 == y2)
					same++;
				else if (x1 == x2)
					map.put(Double.MAX_VALUE, map.getOrDefault(Double.MAX_VALUE, 0) + 1);
				else if (y1 == y2)
					map.put(0d, map.getOrDefault(0d, 0) + 1);
				else {
					double slope = (y1 - y2) / (x1 - x2);
					map.put(slope, map.getOrDefault(slope, 0) + 1);
				}
			}
			int temp = 0;
			for (int x : map.values())
				temp = Math.max(temp, x);
			temp += same;
			result = Math.max(result, temp);
		}
		return result;
	}
}
