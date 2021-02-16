package codeforces;

import java.io.*;

public class P208A_Dubstep {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		System.out.println(s.replace("WUB", " ").trim().replaceAll("(\\s+)", " "));
	}
}
