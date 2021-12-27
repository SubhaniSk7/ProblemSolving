package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1462A_FavoriteSequence {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] b = new int[n];
			for (int i = 0; i < n; ++i)
				b[i] = Integer.parseInt(st.nextToken());

			int l = 0, r = n - 1, i = 0;
			while (l <= r) {
				if (i % 2 == 0)
					System.out.print(b[l++] + " ");
				else
					System.out.print(b[r--] + " ");
				i++;
			}
			System.out.println();
		}
	}
}
