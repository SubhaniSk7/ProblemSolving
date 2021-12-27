package leetproblems;

public class Q1266_MinimumTimeVisitingAllPoints {
//	public int minTimeToVisitAllPoints(int[][] points) {
//		int[] cur = points[0];
//		int time = 0;
//		for (int i = 1; i < points.length; ++i) {
//			int cur_x = cur[0], cur_y = cur[1];
//			int[] next = points[i];
//			while (cur_x != next[0] || cur_y != next[1]) {
//				if (cur_x == next[0]) {
//					time += Math.abs(cur_y - next[1]);
//					cur_y = next[1];
//				} else if (cur_y == next[1]) {
//					time += Math.abs(cur_x - next[0]);
//					cur_x = next[0];
//				} else {
//					time += 1;
//					if (cur_x < next[0])
//						cur_x++;
//					else
//						cur_x--;
//					if (cur_y < next[1])
//						cur_y++;
//					else
//						cur_y--;
//				}
//			}
//			cur = points[i];
//		}
//		return time;
//	}

	public int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		for (int i = 1; i < points.length; ++i) {
			time += Math.max(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
		}
		return time;
	}
}
