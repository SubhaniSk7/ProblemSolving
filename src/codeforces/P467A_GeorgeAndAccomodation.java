package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P467A_GeorgeAndAccomodation {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] rooms = new int[n][2];
		for (int i = 0; i < n; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			rooms[i][0] = Integer.parseInt(st.nextToken());
			rooms[i][1] = Integer.parseInt(st.nextToken());
		}

		solution(n, rooms);
	}

	public static void solution(int n, int[][] rooms) {
		int count = 0;
		for (int i = 0; i < n; ++i) {
			int diff = rooms[i][1] - rooms[i][0];
			if (diff >= 2)
				count++;
		}
		System.out.println(count);
	}
}
