package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q131_PalindromePartitioning {
	List<List<String>> result = new ArrayList<>();

	public List<List<String>> partition(String s) {
		rec(s, 0, new ArrayList<String>());
		return result;
	}

	public void rec(String s, int index, ArrayList<String> al) {
		if (index == s.length()) {
			result.add(new ArrayList<String>(al));
			return;
		}
		for (int i = index; i < s.length(); ++i) {
			String t = s.substring(index, i + 1);
			if (t.length() > 0 && isPalindrome(t)) {
				al.add(t);
				rec(s, i + 1, al);
				al.remove(al.size() - 1);
			}
		}
	}

	public boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
