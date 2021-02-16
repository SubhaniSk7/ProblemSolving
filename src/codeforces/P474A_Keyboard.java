package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P474A_Keyboard {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ch = br.readLine(), s = br.readLine();
		solution(ch, s);
	}

	public static void solution(String ch, String s) {
		String keys = "qwertyuiopasdfghjkl;zxcvbnm,./";
		int pos = 0;
		if (ch.contentEquals("L"))
			pos = 1;
		else
			pos = -1;
		for (int i = 0; i < s.length(); ++i) {
			System.out.print(keys.charAt(keys.indexOf(s.charAt(i)) + pos));
		}
	}
}
