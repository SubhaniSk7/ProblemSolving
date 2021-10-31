package leetproblems;

import java.util.LinkedList;
import java.util.List;

public class Q17_LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
		LinkedList<String> result = new LinkedList<>();
		int n = digits.length();
		if (n == 0)
			return result;
		result.add("");
		String[] letters = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		for (int i = 0; i < n; ++i) {
			int index = Character.getNumericValue(digits.charAt(i));
			while (result.peek().length() == i) {
				String code = result.remove();

				for (char ch : letters[index].toCharArray())
					result.add(code + ch);
			}
		}
		return result;
	}
}
// todo with dfs or bfs --> recursion
