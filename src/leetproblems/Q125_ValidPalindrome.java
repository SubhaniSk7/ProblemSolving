package leetproblems;

public class Q125_ValidPalindrome {
	public boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		s = s.toLowerCase();
		while (i <= j) {
			char x = s.charAt(i), y = s.charAt(j);
			boolean a = Character.isAlphabetic(x), b = Character.isDigit(x);
			boolean c = Character.isAlphabetic(y), d = Character.isDigit(y);
			if (!a && !b) {
				i++;
				continue;
			} else if (!c && !d) {
				j--;
				continue;
			}
			if (x != y)
				return false;
			i++;
			j--;
		}
		return true;
	}
}
