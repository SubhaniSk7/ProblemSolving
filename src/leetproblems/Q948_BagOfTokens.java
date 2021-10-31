package leetproblems;

import java.util.Arrays;

public class Q948_BagOfTokens {
	public int bagOfTokensScore(int[] tokens, int power) {
		Arrays.sort(tokens);
		int n = tokens.length, score = 0;
		int l = 0, r = n - 1;
		while (l <= r) {
			if (tokens[l] <= power) {
				power -= tokens[l];
				score++;
				l++;
			} else {
				if (score > 0 && r - l > 0) {
					power += tokens[r];
					r--;
					score--;
				} else
					break;
			}
		}
		return score;
	}
}
