package leetproblems;

public class Q1332_RemovePalindromicSubsequences {
	public int removePalindromeSub(String s) {
		int n = s.length();
		if (n == 0)
			return 0;
		int i = 0, j = n - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else
				return 2;// remove all a's and then remove all b's
		}
		return 1;// s itself is palindrome
	}
}
