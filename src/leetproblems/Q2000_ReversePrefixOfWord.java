package leetproblems;

public class Q2000_ReversePrefixOfWord {
	public String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);
		if (index == -1)
			return word;

		char[] c = word.toCharArray();
		int l = 0, r = index;
		while (l < r) {
			char t = c[l];
			c[l] = c[r];
			c[r] = t;
			l++;
			r--;
		}
		return String.valueOf(c);
	}
}
