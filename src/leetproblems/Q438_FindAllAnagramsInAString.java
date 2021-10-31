package leetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q438_FindAllAnagramsInAString {
	public static void main(String[] subhani) {
		System.out.println(new Q438_FindAllAnagramsInAString().findAnagrams("cbaebabacd", "abc").toString());
	}

//	public List<Integer> findAnagrams(String s, String p) {
//		int[] freq = new int[26];
//		for (char ch : p.toCharArray())
//			freq[ch - 'a']++;
//		ArrayList<Integer> result = new ArrayList<>();
//		int l = 0, length = p.length();
//		for (int r = 0; r < s.length(); ++r) {
//			char ch = s.charAt(r);
//			if (freq[ch - 'a']-- >= 1)
//				length--;
//			if (length == 0)
//				result.add(l);
//			if (r - l + 1 == p.length() && freq[s.charAt(l++) - 'a']++ >= 0)
//				length++;
//		}
//		return result;
//	}

	public List<Integer> findAnagrams(String s, String p) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : p.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		System.out.println(map.toString());
		ArrayList<Integer> result = new ArrayList<>();
		int k = p.length(), l = 0, unique = map.size();
		for (int r = 0; r < s.length(); ++r) {
			char ch = s.charAt(r);
			if (map.containsKey(ch)) {
				map.put(ch, map.getOrDefault(ch, 0) - 1);
				if (map.get(ch) == 0)
					unique--;
			}
			if (r - l + 1 == k) {
				if (unique == 0)
					result.add(l);
				char left = s.charAt(l);
				if (map.containsKey(left)) {
					map.put(left, map.getOrDefault(left, 0) + 1);
					if (map.get(left) == 1)
						unique++;
				}
				l++;
			}
			System.out.println(l + " " + r + " " + ch);

			System.out.println(map.toString());
			System.out.println();
		}
		return result;
	}
}
