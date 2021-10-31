package leetproblems;

import java.util.HashMap;

public class Q290_WordPattern {
	public boolean wordPattern(String pattern, String s) {
		HashMap<Character, String> map = new HashMap<>();
		String[] words = s.split(" ");
		int p = pattern.length(), n = words.length;
		if (p != n)
			return false;
		for (int i = 0; i < p; ++i) {
			char ch = pattern.charAt(i);
			boolean present = map.containsKey(ch);
			if (present) {
				if (!map.get(ch).equals(words[i]))
					return false;
			} else {
				if (map.containsValue(words[i]))
					return false;
				map.put(ch, words[i]);
			}
		}
		return true;
	}

	public boolean wordPattern_1(String pattern, String s) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] words = s.split(" ");
		int p = pattern.length(), n = words.length;
		if (p != n)
			return false;
		for (int i = 0; i < p; ++i) {
			if (map.putIfAbsent("" + pattern.charAt(i), i) != map.putIfAbsent(words[i], i))
				return false;
		}
		return true;
	}
}
