package leetproblems;

import java.util.HashMap;

public class Q874_WalkingRobotSimulation {
//	public int robotSim(int[] commands, int[][] obstacles) {
//		HashMap<String, Boolean> map = new HashMap<>();
//		for (int[] obs : obstacles)
//			map.put(obs[0] + " " + obs[1], true);
//		int x = 0, y = 0;
//		boolean east = false, north = true, west = false, south = false;
//		int distance = 0;
//		for (int c = 0; c < commands.length; ++c) {
//			if (commands[c] == -1) {
//				if (east) {
//					south = true;
//					east = false;
//				} else if (west) {
//					west = false;
//					north = true;
//				} else if (north) {
//					north = false;
//					east = true;
//				} else {
//					south = false;
//					west = true;
//				}
//				continue;
//			} else if (commands[c] == -2) {
//				if (east) {
//					east = false;
//					north = true;
//				} else if (west) {
//					west = false;
//					south = true;
//				} else if (north) {
//					north = false;
//					west = true;
//				} else {
//					south = false;
//					east = true;
//				}
//				continue;
//			}
//			if (east) {
//				for (int i = 1; i <= commands[c]; ++i) {
//					String k = (x + 1) + " " + y;
//					if (map.containsKey(k))
//						break;
//					x += 1;
//				}
//			} else if (west) {
//				for (int i = 1; i <= commands[c]; ++i) {
//					String k = (x - 1) + " " + y;
//					if (map.containsKey(k))
//						break;
//					x -= 1;
//				}
//			} else if (north) {
//				for (int i = 1; i <= commands[c]; ++i) {
//					String k = x + " " + (y + 1);
//					if (map.containsKey(k))
//						break;
//					y += 1;
//				}
//			} else if (south) {
//				for (int i = 1; i <= commands[c]; ++i) {
//					String k = x + " " + (y - 1);
//					if (map.containsKey(k))
//						break;
//					y -= 1;
//				}
//			}
//
//			distance = Math.max(distance, x * x + y * y);
//			// System.out.println(x+" "+y+" "+distance);
//		}
//		return distance;
//	}

	public int robotSim_1(int[] commands, int[][] obstacles) {
		HashMap<String, Boolean> map = new HashMap<>();
		for (int[] obs : obstacles)
			map.put(obs[0] + " " + obs[1], true);
		int x = 0, y = 0, direction = 0, distance = 0;
		int[] x_dir = { 0, 1, 0, -1 };
		int[] y_dir = { 1, 0, -1, 0 };

		for (int c = 0; c < commands.length; ++c) {
			if (commands[c] == -1) {
				direction = (direction == 3 ? 0 : direction + 1);
				continue;
			} else if (commands[c] == -2) {
				direction = (direction == 0 ? 3 : direction - 1);
				continue;
			}
			int x_inc = x_dir[direction];
			int y_inc = y_dir[direction];
			for (int i = 1; i <= commands[c]; ++i) {
				String k = (x + x_inc) + " " + (y + y_inc);
				if (map.containsKey(k))
					break;
				x += x_inc;
				y += y_inc;
			}

			distance = Math.max(distance, x * x + y * y);
		}
		return distance;
	}
}
