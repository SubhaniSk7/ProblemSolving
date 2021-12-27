package leetproblems;

import java.util.HashMap;

public class Q76_MinimumWindowSubstring {

	public String minWindow(String s, String t) {
		if (s.length() == 0 || s.length() < t.length())
			return "";
		HashMap<Character, Integer> map = new HashMap<>();
		int m = s.length(), n = t.length(), count = 0, l = 0, start = -1, len = Integer.MAX_VALUE;
		for (char ch : t.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		for (int r = 0; r < m; ++r) {
			char ch = s.charAt(r);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) >= 0)
					count++;
				while (count == n) {
					if (r - l + 1 < len) {
						start = l;
						len = r - l + 1;
					}
					char s1 = s.charAt(l);
					if (map.containsKey(s1)) {
						map.put(s1, map.get(s1) + 1);
						if (map.get(s1) > 0)
							count--;
					}
					l++;
				}
			}
		}
		if (len != Integer.MAX_VALUE)
			return s.substring(start, start + len);
		return "";
	}
}
