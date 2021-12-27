package leetproblems;

public class Q1041_RobotBoundedInCircle {
	public boolean isRobotBounded(String instructions) {
		int dir_x = 0, dir_y = 1, x = 0, y = 0;
		for (char ch : instructions.toCharArray()) {
			if (ch == 'L') {
				int temp = dir_x;
				dir_x = -1 * dir_y;
				dir_y = temp;
			} else if (ch == 'R') {
				int temp = dir_x;
				dir_x = dir_y;
				dir_y = -1 * temp;
			} else {
				x += dir_x;
				y += dir_y;
			}
		}
		return (x == 0 && y == 0) || (dir_x != 0 || dir_y != 1);// return to center or direction changed (dir_x, dir_y != 0,1)
	}
}
