package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1220A_Cards {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		sol(n, s);
	}

	public static void sol(int n, String s) {
		int nCount = n - s.replaceAll("n", "").length(), zCount = n - s.replaceAll("z", "").length();
		String result = "";
		for (int i = 0; i < nCount; ++i)
			System.out.print(1 + " ");
		for (int i = 0; i < zCount; ++i)
			System.out.print(0 + " ");
	}
}