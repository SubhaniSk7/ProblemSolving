package cf.challenges2018.JuneChallenge2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SheokandandString_SHKSTR_COPY2 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, q;
		n = Integer.parseInt(br.readLine());

		int i, j, k;
		String[] str = new String[n];

		for (i = 0; i < n; i++)
			str[i] = br.readLine();

		q = Integer.parseInt(br.readLine());
		int[] r = new int[q];
		String[] p = new String[q];

		StringTokenizer tk;
		for (i = 0; i < q; i++) {
			tk = new StringTokenizer(br.readLine(), " ");
			r[i] = Integer.parseInt(tk.nextToken());
			p[i] = tk.nextToken();
		}

		for (i = 0; i < q; i++) {
			int large = -1;

			int[] prefixLength = new int[r[i]];
			int count;

			for (j = 0; j < r[i]; j++) {
				count = 0;
				for (k = 0; k < Math.min(p[i].length(), str[j].length()); k++) {
					if (str[j].charAt(k) == p[i].charAt(k)) {
						count++;
					} else
						break;
				}
				prefixLength[j] = count;

				if (large < count)
					large = count;
			}
			ArrayList<String> answer = new ArrayList<String>();
			for (int x = 0; x < prefixLength.length; x++) {
				if (large == prefixLength[x])
					answer.add(str[x]);
			}
			Collections.sort(answer);
			System.out.println(answer.get(0));
		}
	}
}
