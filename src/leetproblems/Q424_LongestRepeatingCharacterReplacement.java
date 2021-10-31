package leetproblems;

import java.util.HashMap;

public class Q424_LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
		int n = s.length(), l = 0, max = Integer.MIN_VALUE, maxCount = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int r = 0; r < n; ++r) {
			char ch = s.charAt(r);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			maxCount = Math.max(maxCount, map.get(ch));

			while (r - l + 1 - maxCount > k) {
				char t = s.charAt(l);
				map.put(t, map.getOrDefault(t, 0) - 1);
				l++;
			}
			max = Math.max(max, r - l + 1);
		}
		return max;
	}
}
