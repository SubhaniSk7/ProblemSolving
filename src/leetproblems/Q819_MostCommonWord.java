package leetproblems;

import java.util.HashMap;
import java.util.HashSet;

public class Q819_MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		HashSet<String> set = new HashSet<>();
		for (String str : banned)
			set.add(str);

		String[] words = paragraph.toLowerCase().split("\\W+");
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : words) {
			if (!set.contains(s))
				map.put(s, map.getOrDefault(s, 0) + 1);
		}

		String result = "";
		int max = 0;
		for (String s : map.keySet()) {
			if (max < map.get(s)) {
				max = map.get(s);
				result = s;
			}
		}
		return result;
	}
}
