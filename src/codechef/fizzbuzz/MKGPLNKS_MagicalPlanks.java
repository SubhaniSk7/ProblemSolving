package codechef.fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MKGPLNKS_MagicalPlanks {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			solve(n, s);
		}
	}

	public static void solve(int n, String s) {
		char[] ch = s.toCharArray();
		char prev = ch[0];
		int w = 0, b = 0;
		if (prev == 'W')
			w++;
		else
			b++;
		for (int i = 0; i < n; ++i) {
			if (prev == ch[i])
				continue;

			if (ch[i] == 'W')
				w++;
			if (ch[i] == 'B')
				b++;

			prev = ch[i];
		}
		System.out.println(Math.min(w, b));
	}
}
