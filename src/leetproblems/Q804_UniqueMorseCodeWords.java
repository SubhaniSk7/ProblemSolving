package leetproblems;

import java.util.HashSet;

public class Q804_UniqueMorseCodeWords {
	public static void main(String[] subhani) {
		Q804_UniqueMorseCodeWords obj = new Q804_UniqueMorseCodeWords();
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(obj.uniqueMorseRepresentations(words));
	}

	public int uniqueMorseRepresentations(String[] words) {
		HashSet<String> set = new HashSet<>();
		String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		for (String s : words) {
			StringBuilder sb = new StringBuilder();
			for (char ch : s.toCharArray())
				sb.append(code[ch - 'a']);
			set.add(sb.toString());
		}
		return set.size();
	}
}
