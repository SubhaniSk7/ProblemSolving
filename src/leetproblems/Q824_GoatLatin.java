package leetproblems;

import java.util.HashSet;

public class Q824_GoatLatin {
	public String toGoatLatin(String sentence) {
		HashSet<Character> set = new HashSet<>();
		String vowels = "aeiouAEIOU";
		for (char ch : vowels.toCharArray())
			set.add(ch);

		StringBuilder result = new StringBuilder();
		String[] words = sentence.split(" ");
		String a = "a";
		int i = 0;
		for (String w : words) {
			if (i != 0)
				result.append(" ");
			if (!set.contains(w.charAt(0))) {
				w = w.substring(1) + w.charAt(0);
			}
			w = w + "ma";
			w = w + a;
			a = a + "a";
			result.append(w);
			i = 1;
		}
		return result.toString();
	}
}
