package lc.problems;

import java.io.*;
import java.util.*;

public class LongestPalindromicSubstring_Q5 {

	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {
		int i, j, k;
		HashSet<String> palindromes = new HashSet<String>();
		for (i = 0; i < s.length(); i++) {
			String pal = "" + s.charAt(i);
			k = i;
			for (j = s.length() - 1; j >= k; j--) {
				if (s.charAt(k) == s.charAt(j))
					k++;
			}
		}

		int len = 0;
		String result = "";
		Iterator<String> itr = palindromes.iterator();
		while (itr.hasNext()) {
			String val = itr.next();
			if (len < val.length()) {
				len = val.length();
				result = val;
			}
		}
		return result;
	}
}
