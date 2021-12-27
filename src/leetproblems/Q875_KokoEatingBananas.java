package leetproblems;

import java.util.Arrays;

public class Q875_KokoEatingBananas {
	public int minEatingSpeed(int[] piles, int h) {
		Arrays.sort(piles);
		int n = piles.length, start = 1, end = piles[n - 1], k = 0, result = piles[n - 1];
		while (start <= end) {
			k = start + (end - start) / 2;
			int hours = 0;
			for (int p : piles)
				hours += (p + k - 1) / k;
			if (hours <= h) {
				result = k;
				end = k - 1;
			} else if (hours > h)
				start = k + 1;
		}
		return result;
	}
}
