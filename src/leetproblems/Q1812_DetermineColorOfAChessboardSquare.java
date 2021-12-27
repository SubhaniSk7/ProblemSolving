package leetproblems;

public class Q1812_DetermineColorOfAChessboardSquare {
	public boolean squareIsWhite(String coordinates) {
//		int c = coordinates.charAt(0) - 'a';
//		int r = coordinates.charAt(1) - '1';
//		if ((r % 2 == 0 && c % 2 == 1) || (r % 2 == 1 && c % 2 == 0))
//			return true;
//		return false;

		return coordinates.charAt(0) % 2 != coordinates.charAt(1) % 2;
	}
}
