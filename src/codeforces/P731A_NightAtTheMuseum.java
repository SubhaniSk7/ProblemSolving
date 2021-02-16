package codeforces;

import java.io.*;

public class P731A_NightAtTheMuseum {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		int rotations = 0, cw = Integer.MAX_VALUE, ccw = Integer.MAX_VALUE, present = 'a' - 97;
		for (int i = 0; i < s.length(); ++i) {
			int ch = s.charAt(i) - 97;
			if (ch >= present) {
				cw = ch - present;
				ccw = present - 'a' + 97 + 1 + 'z' - 97 - ch;
			} else {
				cw = present - ch;
				ccw = ch - 'a' + 97 + 1 + 'z' - 97 - present;
			}
			rotations += Math.min(cw, ccw);
			present = ch;
		}
		System.out.println(rotations);// or min( abs(present-ch), 26-abs(present-ch) )
	}
}
