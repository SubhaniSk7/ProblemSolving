package leetproblems;

import java.util.Arrays;

public class Q1930_UniqueLength3PalindromicSubsequences {
	public int countPalindromicSubsequence(String s) {
		int count = 0, n = s.length();
		int[] first = new int[26], last = new int[26];
		Arrays.fill(first, Integer.MAX_VALUE);
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			int ind = ch - 'a';
			first[ind] = Math.min(first[ind], i);
			last[ind] = i;
		}

		for (int i = 0; i < 26; ++i) {
			if (first[i] < last[i]) {
				String t = s.substring(first[i] + 1, last[i]);
				count += t.chars().distinct().count();
			}
		}
		return count;
	}
}
