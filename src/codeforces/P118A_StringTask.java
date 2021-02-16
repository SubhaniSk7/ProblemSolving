package codeforces;

import java.io.*;

public class P118A_StringTask {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); ++i) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'y')
				continue;
			else
				System.out.print("." + ch[i]);
		}
	}
}
