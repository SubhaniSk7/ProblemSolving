package codeforces;

import java.io.*;
import java.util.*;

public class P231A_Team {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] views = new int[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			views[i][0] = Integer.parseInt(st.nextToken());
			views[i][1] = Integer.parseInt(st.nextToken());
			views[i][2] = Integer.parseInt(st.nextToken());
		}
		solution(views, n);
	}

	public static void solution(int[][] views, int n) {
		int writes = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < 3; j++)
				if (views[i][j] == 1)
					count++;
			if (count >= 2)
				writes++;
		}
		System.out.println(writes);
	}
}
