package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q03_LongestSubstringWithoutRepeatingCharacters {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(lengthOfLongestSubstring(s));
	}

//	public static int lengthOfLongestSubstring(String s) {
//		int len = 0;
//		HashSet<String> result = new HashSet<>();
//		for (int i = 0; i < s.length(); i++) {
//			String temp = "" + s.charAt(i);
//			for (int j = i + 1; j < s.length(); j++) {
//				if (temp.contains("" + s.charAt(j)))
//					break;
//				else
//					temp += s.charAt(j);
//			}
////			System.out.println("-" + temp + "-");
//			result.add(temp);
//		}
//		Iterator<String> itr = result.iterator();
//		while (itr.hasNext()) {
//			String val = itr.next();
//			if (len < val.length())
//				len = val.length();
//		}
//
//		return len;
//	}

	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int max = 0, l = 0, r = 0;
		while (r < s.length()) {
			char ch = s.charAt(r);
			if (!set.contains(ch)) {
				set.add(ch);
				max = Math.max(max, set.size());
				r++;
			} else {
				char c = s.charAt(l);
				set.remove(c);
				l++;
			}
		}
		return max;
	}
}
