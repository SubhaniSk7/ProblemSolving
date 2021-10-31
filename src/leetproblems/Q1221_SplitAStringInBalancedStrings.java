package leetproblems;

public class Q1221_SplitAStringInBalancedStrings {
	public int balancedStringSplit(String s) {
		int count = 0, balance = 0;
		for (int r = 0; r < s.length(); ++r) {
			if (s.charAt(r) == 'L')
				balance++;
			else
				balance--;
			if (balance == 0) {
				count++;
			}
		}
		return count;
	}
}
