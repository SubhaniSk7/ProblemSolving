package leetproblems;

public class Q1232_CheckIfItIsAStraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		if (coordinates.length == 2)
			return true;
		int x1 = coordinates[0][0], y1 = coordinates[0][1];
		int x2 = coordinates[1][0], y2 = coordinates[1][1];
		for (int i = 2; i < coordinates.length; ++i) {
			int x3 = coordinates[i][0], y3 = coordinates[i][1];
			if ((x1 - x2) * (y1 - y3) != (x1 - x3) * (y1 - y2))
				return false;
		}
		return true;
	}
}
