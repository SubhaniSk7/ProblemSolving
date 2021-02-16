package codeforces;

import java.io.*;

public class P131A_cAPSlOCK {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		boolean allUpper = true;
		for (int i = 1; i < s.length(); ++i)
			if (s.charAt(i) >= 97) {
				allUpper = false;
				break;
			}
		if (!allUpper)
			System.out.println(s);
		else {
			if (s.charAt(0) >= 97)
				System.out.println((char) (s.charAt(0) - 32) + "" + s.substring(1).toLowerCase());
			else if (s.charAt(0) < 97 && allUpper)
				System.out.println(s.toLowerCase());
			else
				System.out.println(s);
		}
	}
}
