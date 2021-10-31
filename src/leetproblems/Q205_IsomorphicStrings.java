package leetproblems;

import java.util.HashMap;

public class Q205_IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map1 = new HashMap<>(), map2 = new HashMap<>();
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); ++i) {
			char s1 = s.charAt(i), t1 = t.charAt(i);
			if ((map1.containsKey(s1) && map1.get(s1) != t1) || (map2.containsKey(t1) && map2.get(t1) != s1))
				return false;
			else {
				map1.put(s1, t1);
				map2.put(t1, s1);
			}
		}
		return true;
	}
}
