package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P268A_Games {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] uniform = new int[n][2];
		StringTokenizer st;
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			uniform[i][0] = Integer.parseInt(st.nextToken());
			uniform[i][1] = Integer.parseInt(st.nextToken());
		}
		solution(n, uniform);
	}

	public static void solution(int n, int[][] uniform) {
		int count = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; ++j)
				if (i != j && uniform[i][0] == uniform[j][1])
					count++;
		System.out.println(count);
	}
}
