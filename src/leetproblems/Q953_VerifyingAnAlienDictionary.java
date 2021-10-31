package leetproblems;

import java.util.HashMap;

public class Q953_VerifyingAnAlienDictionary {
	HashMap<Character, Integer> map = new HashMap<>();

	public boolean isAlienSorted(String[] words, String order) {
		int n = words.length;
		for (int i = 0; i < 26; ++i)
			map.put(order.charAt(i), i);

		for (int i = 1; i < n; ++i)
			if (!lexico(words[i - 1], words[i]))
				return false;
		return true;
	}

	public boolean lexico(String s1, String s2) {
		int n = s1.length(), m = s2.length();
		for (int i = 0, j = 0; i < n && j < m; ++i, ++j) {
			char c1 = s1.charAt(i), c2 = s2.charAt(j);
			int v1 = map.get(c1), v2 = map.get(c2);
			if (v1 < v2)
				return true;
			if (v1 > v2)
				return false;
		}
		return n <= m;
	}
}
