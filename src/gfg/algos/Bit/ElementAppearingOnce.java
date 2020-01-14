// except one element, all other elements appears twice. return that one element which appears only once.
package gfg.algos.Bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ElementAppearingOnce {

	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), i, j = 0;
		int[] result = new int[t];
		while (t > 0) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			result[j++] = getUnique(arr);
			t--;
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	public static int getUnique(int[] arr) {
		int i, x = 0;
		for (i = 0; i < arr.length; i++) {
			x ^= arr[i];
		}
		return x;
	}
}
