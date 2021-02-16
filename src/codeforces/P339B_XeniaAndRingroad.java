package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P339B_XeniaAndRingroad {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] house = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++)
			house[i] = Integer.parseInt(st.nextToken());
		solution(n, m, house);
	}

	public static void solution(int n, int m, int[] house) {
		long time = 0;
		int present = 1;
		for (int i = 1; i <= m; ++i) {
			if (present == house[i - 1]) {
				continue;
			} else {
				if (present < house[i - 1]) {
					int move = house[i - 1] - present;
					time += move;
				} else if (present > house[i - 1]) {
					int move = n - present + house[i - 1];
					time += move;
				}
				present = house[i - 1];
			}
		}
		System.out.println(time);
	}
}
