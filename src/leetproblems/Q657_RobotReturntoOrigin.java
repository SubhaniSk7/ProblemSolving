package leetproblems;

public class Q657_RobotReturntoOrigin {
	public boolean judgeCircle(String moves) {
		int x = 0, y = 0;
		for (char ch : moves.toCharArray()) {
			if (ch == 'U')
				y += 1;
			if (ch == 'D')
				y -= 1;
			if (ch == 'R')
				x += 1;
			if (ch == 'L')
				x -= 1;
		}
		return x == 0 && y == 0;
	}
}
