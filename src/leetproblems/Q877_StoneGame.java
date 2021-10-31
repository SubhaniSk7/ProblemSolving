package leetproblems;

public class Q877_StoneGame {
	public boolean stoneGame_1(int[] piles) {
		return true;
	}

	private class Pair {
		int alice = 0, bob = 0;
		int pick = 0;

		Pair(int alice, int bob) {
			this.alice = alice;
			this.bob = bob;
		}
	}

	public boolean stoneGame(int[] piles) {
		int n = piles.length;
		Pair[][] dp = new Pair[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					dp[i][i] = new Pair(piles[i], 0);// only 1 element -> alice always picks
					dp[i][i].pick = i;
				} else
					dp[i][j] = new Pair(0, 0);
			}
		}
		for (int len = 2; len <= n; ++len) {// iterating diagonally
			for (int r = 0; r < n - len + 1; ++r) {
				int c = r + len - 1;
				int v1 = piles[r] + dp[r + 1][c].bob;
				int v2 = piles[c] + dp[r][c - 1].bob;

				if (v1 > v2) {
					dp[r][c] = new Pair(v1, dp[r + 1][c].alice);
					dp[r][c].pick = r;
				} else {
					dp[r][c] = new Pair(v2, dp[r][c - 1].alice);
					dp[r][c].pick = c;
				}
			}
		}

		return dp[0][n - 1].alice > dp[0][n - 1].bob;
	}
}
//    0     1     2     3
//    5     3     4     5
//0 5 (5,0) 
//1 3       (3,0) 
//2 4             (4,0) 
//3 5                   (5,0)
