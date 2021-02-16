package codeforces;

import java.io.*;

public class P978B_FileName {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String filename = br.readLine();
		solution(n, filename);
	}

	public static void solution(int n, String filename) {
		boolean loop = true;
		int count = 0;
		while (loop) {
			if (filename.contains("xxx")) {
				filename = filename.replaceFirst("xxx", "xx");
				count++;
			} else
				loop = false;
		}
		System.out.println(count);
	}
}
