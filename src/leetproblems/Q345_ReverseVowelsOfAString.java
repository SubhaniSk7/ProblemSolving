package leetproblems;

import java.util.ArrayList;
import java.util.HashSet;

public class Q345_ReverseVowelsOfAString {
	public String reverseVowels(String s) {
		ArrayList<Character> vowels = new ArrayList<>();
		HashSet<Character> set = new HashSet<>();
		for (char v : "aeiouAEIOU".toCharArray())
			set.add(v);
		for (char ch : s.toCharArray()) {
			if (set.contains(ch))
				vowels.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		int i = vowels.size() - 1;
		for (char ch : s.toCharArray()) {
			if (set.contains(ch))
				sb.append(vowels.get(i--));
			else
				sb.append(ch);
		}
		return sb.toString();
	}
}
