package leetproblems;

public class Q1217_MinimumCostToMoveChipsToTheSamePosition {
	public int minCostToMoveChips(int[] position) {
		int even = 0, odd = 0;
		for (int x : position) {
			if ((x & 1) == 1)
				odd++;
			else
				even++;
		}
		return Math.min(odd, even);
	}
}
