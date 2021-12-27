package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q784_LetterCasePermutation {
	List<String> result = new ArrayList<>();

	public List<String> letterCasePermutation(String s) {
		rec(s.toCharArray(), 0);
		return result;
	}

	public void rec(char[] s, int index) {
		if (index == s.length) {
			result.add(String.valueOf(s));
			return;
		}
		if (Character.isDigit(s[index])) {
			rec(s, index + 1);
		} else {
			s[index] = Character.toLowerCase(s[index]);
			rec(s, index + 1);
			s[index] = Character.toUpperCase(s[index]);
			rec(s, index + 1);
		}
	}
}
