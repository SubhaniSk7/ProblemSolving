package codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TYPING {

	public static void main(String subhani[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine()), i, j, k = 0, prev;
			double result = 0;
			String[] arr = new String[n];

			for (i = 0; i < n; i++) {// left =0, right=1
				double time = 0;
				String word = br.readLine();
				arr[k++] = word;
				time += 2;
				if (word.charAt(0) == 'd' || word.charAt(0) == 'f')
					prev = 0;
				else
					prev = 1;
				for (j = 1; j < word.length(); j++) {

					if (word.charAt(j) == 'd' || word.charAt(j) == 'f') {// left==>0
						if (prev == 0)
							time += 4;
						else
							time += 2;
						prev = 0;
					} else {// right==>1
						if (prev == 1)
							time += 4;
						else
							time += 2;
						prev = 1;
					}
				}

				for (int l = 0; l < k - 1; l++) {
					if (arr[l].equals(word)) {
						time /= 2;
						break;
					}
				}
				result += time;
			}
			System.out.println((int) result);
		}
	}
}
