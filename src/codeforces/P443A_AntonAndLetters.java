package codeforces;

import java.io.*;
import java.util.HashSet;

public class P443A_AntonAndLetters {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.replace("{", "").replace("}", "").replace(",", "").replace(" ", "");// stringtokenizer and skip {,},space
																					// and comma(,)
		char[] letters = s.toCharArray();
		solution(letters);

	}

	public static void solution(char[] letters) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < letters.length; ++i)
			set.add(letters[i]);
		System.out.println(set.size());
	}
}
