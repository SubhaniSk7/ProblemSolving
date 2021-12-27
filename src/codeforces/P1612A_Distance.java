package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1612A_Distance {

	public static void main(String[] subhani) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if ((x + y) % 2 != 0)
				System.out.println(-1 + " " + -1);
			else {

				if (x == 0) {
					System.out.println(x + " " + y / 2);
				} else if (y == 0) {
					System.out.println(x / 2 + " " + y);
				} else {
					int val = (x + y) / 2;
					if (x > y) {
						System.out.println(((x - val)) + " " + y);
					} else {
						System.out.println(x + " " + (y - val));
					}
				}
			}
		}
	}
}