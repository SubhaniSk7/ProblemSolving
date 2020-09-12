package codeforces;

import java.io.*;
import java.util.*;

public class P50A_DominoPiling {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		solution(m, n);
	}

	public static void solution(int m, int n) {
		int dominoCount = 0, rows = 0, columns = 0;
		rows = m / 2;
		columns = n;
		if (m % 2 == 0)
			dominoCount = rows * columns;
		if (m % 2 == 1)
			dominoCount = rows * columns + (n / 2);
		System.out.println(dominoCount);
	}
}
