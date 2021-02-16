package codeforces;

import java.io.*;

public class P746B_Decoding {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		solution(n, s);
	}

	public static void solution(int n, String s) {
		String original = "";
		int temp = n;
		for (int i = 0; i < n; ++i) {
			if (temp % 2 == 0)
				original = s.charAt(i) + original;
			else
				original = original + s.charAt(i);
			temp--;
		}
		System.out.println(original);
	}
}
