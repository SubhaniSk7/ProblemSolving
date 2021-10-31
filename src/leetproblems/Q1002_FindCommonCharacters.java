package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q1002_FindCommonCharacters {
	public List<String> commonChars(String[] words) {

		ArrayList<String> result = new ArrayList<>();

		String chars = words[0];
		for (char ch : chars.toCharArray()) {
			boolean flag = true;
			for (int i = 1; i < words.length; ++i) {
				if (!words[i].contains("" + ch)) {
					flag = false;
					break;
				} else {
					words[i] = words[i].replaceFirst("" + ch, "");
				}
			}
			if (flag)
				result.add("" + ch);
		}
		return result;
	}
}
