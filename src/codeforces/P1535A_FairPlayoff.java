package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1535A_FairPlayoff {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = 0, second = 0;
			int[] skills = new int[4];
			for (int i = 0; i < 4; ++i) {
				skills[i] = Integer.parseInt(st.nextToken());
				if (first < skills[i]) {
					second = first;
					first = skills[i];
				} else if (second < skills[i])
					second = skills[i];
			}
			boolean one = (first == skills[0] || first == skills[1]) && (second == skills[0] || second == skills[1]);
			boolean two = (first == skills[2] || first == skills[3]) && (second == skills[2] || second == skills[3]);
			if (one || two)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
