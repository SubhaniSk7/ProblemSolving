package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P266B_QueueAtTheSchool {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		solution(n, t, s);
	}

	public static void solution(int n, int t, String s) {
		for (int i = 1; i <= t; ++i) {
			for (int j = 0; j < n - 1; ++j) {
				if (s.charAt(j) == 'B' && s.charAt(j + 1) == 'G') {
					s = s.substring(0, j) + "GB" + s.substring(j + 2);
					++j;
				}
			}
		}
		System.out.println(s);
	}
}
