package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P732A_BuyAShovel {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		solution(k, r);
	}

	public static void solution(int k, int r) {
		int i = 1;
		while (true) {
			if ((i * k) % 10 == r || (i * k) % 10 == 0)
				break;
			i++;
		}
		System.out.println(i);
	}
}
