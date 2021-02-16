package codeforces;

import java.io.*;
import java.util.*;

public class P499B_Lecture {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		HashMap<String, String> lang = new HashMap<String, String>();
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			lang.put(st.nextToken(), st.nextToken());
		}
		String[] text = br.readLine().split(" ");
		solution(n, m, lang, text);
	}

	public static void solution(int n, int m, HashMap<String, String> lang, String[] text) {
		for (int i = 0; i < n; ++i) {
			String s = lang.get(text[i]);
			if (s.length() < text[i].length())
				System.out.print(s + " ");
			else
				System.out.print(text[i] + " ");
		}
	}
}
