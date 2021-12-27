package leetproblems;

public class Q1523_CountOddNumbersInAnIntervalRange {
	public int countOdds(int low, int high) {
		int range = high - low + 1;
		if (range % 2 == 0)
			return range / 2;
		else
			return range / 2 + (low % 2 == 0 ? 0 : 1);

		// return (high+1)/2 - low/2;
	}
}
