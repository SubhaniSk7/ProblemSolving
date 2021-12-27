package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1363A_OddSelection {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int odds = 0, evens = 0;
			for (int i = 0; i < n; ++i) {
				int ele = Integer.parseInt(st.nextToken());
				if (ele % 2 == 0)
					evens++;
				else
					odds++;
			}

			if (odds == 0)
				System.out.println("NO");
			else {
				int taken = 0;
				if (x < odds) {
					if (x % 2 == 0) {
						if (evens >= 1)
							System.out.println("YES");
						else
							System.out.println("NO");
					} else
						System.out.println("YES");
				} else {
					if (odds % 2 == 0)
						taken = odds - 1;
					else
						taken = odds;
					if (evens >= x - taken)
						System.out.println("YES");
					else
						System.out.println("NO");
				}
			}
		}
	}
}
