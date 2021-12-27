package leetproblems;

public class Q1688_CountOfMatchesInTournament {
//	public int numberOfMatches(int n) {
//		int result = 0;
//		while (n > 1) {
//			if (n % 2 == 0) {
//				result += n / 2;
//				n /= 2;
//			} else {
//				result += n / 2;
//				n = n / 2 + 1;
//			}
//		}
//		return result;
//	}

	public int numberOfMatches(int n) {
		return n - 1;
	}
}
