package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1560A_DislikeOfThrees {
	public static int[] seq = new int[1000 + 5];

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		solve();
		while (t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			System.out.println(seq[k]);
		}
	}

	public static void solve() {
		Arrays.fill(seq, -1);
		int count = 1;
		int i = 1, j = 1;
		while (count <= 1000) {
			if (i % 3 == 0 || i % 10 == 3) {
				i++;
				continue;
			}
			seq[j++] = i;
			i++;
			count++;
		}
	}
}
