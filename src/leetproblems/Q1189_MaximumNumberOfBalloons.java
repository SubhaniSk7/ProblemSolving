package leetproblems;

public class Q1189_MaximumNumberOfBalloons {
	public int maxNumberOfBalloons(String text) {
		int[] freq = new int[26];
		for (char ch : text.toCharArray())
			freq[ch - 'a']++;
		char[] ch = new char[] { 'b', 'a', 'l', 'o', 'n' };
		int min = Integer.MAX_VALUE;
		for (char c : ch) {
			if (c == 'l' || c == 'o')
				min = Math.min(min, freq[c - 'a'] / 2);
			else
				min = Math.min(min, freq[c - 'a']);
		}
		return min;
	}
}
