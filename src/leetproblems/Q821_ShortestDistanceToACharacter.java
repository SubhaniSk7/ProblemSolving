package leetproblems;

import java.util.Arrays;

public class Q821_ShortestDistanceToACharacter {
	public int[] shortestToChar(String s, char c) {
		int n = s.length();
		int MAX = 100000;
		int[] result = new int[n];
		Arrays.fill(result, MAX);
		int pos = -MAX;
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == c) {
				pos = i;
			}
			result[i] = i - pos;
		}
		for (int i = n - 1; i >= 0; --i) {
			if (s.charAt(i) == c) {
				pos = i;
			}
			result[i] = Math.min(result[i], Math.abs(i - pos));
		}
		return result;
	}
}
