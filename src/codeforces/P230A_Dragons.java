package codeforces;

import java.io.*;
import java.util.*;

public class P230A_Dragons {
	int x, y;

	public P230A_Dragons(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		ArrayList<P230A_Dragons> dragons = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			P230A_Dragons d = new P230A_Dragons(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			dragons.add(d);
		}
		solution(s, n, dragons);
	}

	public static void solution(int s, int n, ArrayList<P230A_Dragons> dragons) {
		Collections.sort(dragons, (p1, p2) -> ((Integer) p1.x).compareTo(p2.x));
		boolean level = true;
		for (int i = 0; i < n; ++i) {
			if (dragons.get(i).x < s) {
				s += dragons.get(i).y;
			} else {
				level = false;
				break;
			}
		}
		if (level)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
