package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P686A_FreeIceCream {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long x = Long.parseLong(st.nextToken());
		int count = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String choice = st.nextToken();
			long val = Long.parseLong(st.nextToken());
			if (choice.equals("+"))
				x += val;
			else {
				if (x >= val)
					x -= val;
				else
					count++;
			}
		}
		sb.append(x + " " + count + "\n");
		System.out.println(sb.toString());
	}
}
