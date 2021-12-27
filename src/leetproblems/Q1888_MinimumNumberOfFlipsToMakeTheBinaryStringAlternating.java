package leetproblems;

public class Q1888_MinimumNumberOfFlipsToMakeTheBinaryStringAlternating {
	public int minFlips(String s) {
		int n = s.length();
		s = s + s;
		StringBuilder s1 = new StringBuilder();// 101010..
		StringBuilder s2 = new StringBuilder();// 010101..
		for (int i = 0; i < s.length(); ++i) {
			if (i % 2 == 0) {
				s1.append("1");
				s2.append("0");
			} else {
				s1.append("0");
				s2.append("1");
			}
		}
		String t1 = s1.toString(), t2 = s2.toString();
		int diff1 = 0, diff2 = 0, l = 0, swaps = Integer.MAX_VALUE;
		for (int r = 0; r < s.length(); ++r) {
			if (s.charAt(r) != t1.charAt(r))
				diff1++;
			if (s.charAt(r) != t2.charAt(r))
				diff2++;
			if (r - l + 1 > n) {
				if (t1.charAt(l) != s.charAt(l))
					diff1--;
				if (t2.charAt(l) != s.charAt(l))
					diff2--;
				l++;
			}
			if (r - l + 1 == n)
				swaps = Math.min(swaps, Math.min(diff1, diff2));
		}
		return swaps;
	}
}
