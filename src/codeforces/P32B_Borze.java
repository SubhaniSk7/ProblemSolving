package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P32B_Borze {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < s.length()) {
			if (ch[i] == '.') {
				sb.append(0);
				i++;
			} else if (ch[i] == '-') {
				if (ch[i + 1] == '.')
					sb.append("1");
				else
					sb.append("2");
				i += 2;
			}
		}
		System.out.println(sb.toString());
	}
}
