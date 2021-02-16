package codeforces;

import java.io.*;
import java.util.*;

public class P1097A_GennadyAndACardGame {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String table = br.readLine();
		String hand[] = new String[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; ++i)
			hand[i] = st.nextToken();
		solution(table, hand);
	}

	public static void solution(String table, String[] hand) {
		boolean print = false;
		for (int i = 0; i < 5; ++i) {
			if (hand[i].charAt(0) == table.charAt(0) || hand[i].charAt(1) == table.charAt(1)) {
				print = true;
				break;
			}
		}
		if (print)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
