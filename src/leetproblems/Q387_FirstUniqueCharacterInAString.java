package leetproblems;

import java.util.HashMap;

public class Q387_FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		int n = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch))
				map.put(ch, i);
			else
				map.put(ch, -1);
		}
		int result = Integer.MAX_VALUE;
		for (char c : map.keySet()) {
			if (map.get(c) > -1 && result > map.get(c))
				result = map.get(c);
		}
		return result == Integer.MAX_VALUE ? -1 : result;
	}
}
