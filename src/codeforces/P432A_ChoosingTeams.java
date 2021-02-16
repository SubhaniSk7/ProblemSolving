package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P432A_ChoosingTeams {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] members = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			members[i] = Integer.parseInt(st.nextToken());
		solution(n, k, members);
	}

	public static void solution(int n, int k, int[] members) {
		int validMembers = 0;
		for (int i = 0; i < n; ++i) {
			if (members[i] + k <= 5)
				validMembers++;
		}
		System.out.println(validMembers / 3);
	}
}
