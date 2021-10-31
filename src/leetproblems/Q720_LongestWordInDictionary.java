package leetproblems;

import java.util.Arrays;
import java.util.HashSet;

public class Q720_LongestWordInDictionary {
	public String longestWord(String[] words) {
		Arrays.sort(words);
		HashSet<String> set = new HashSet<String>();
		String result = "";
		for (String s : words) {
			if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
				if (s.length() > result.length())
					result = s;
				set.add(s);
			}
		}
		return result;
	}
}
