// except one element, all other elements appears thrice. return that one element which appears only once.

//////////////////////////////
// Analyse and trace
//////////////////////////////
package gfg.algos.Bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindTheElementThatAppearsOnce {

	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t > 0) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int i;

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			int unique = getUnique(arr);
			System.out.println(unique);
			t--;
		}
	}

	public static int getUnique(int[] arr) {
		int i, ones = 0, twos = 0, notThrees = 0, x;
		for (i = 0; i < arr.length; i++) {
			System.out.println("------------Iter " + (i + 1) + "----------------");
			x = arr[i];
			System.out.println(x);
			twos = twos | (ones & x);
			System.out.println("-->twos:" + twos);
			ones = ones ^ x;
			System.out.println("-->ones:" + ones);
			notThrees = ~(ones & twos);
			System.out.println("-->notThrees:" + notThrees);
			ones = ones & notThrees;
			System.out.println("-->ones:" + ones);
			twos = twos & notThrees;
			System.out.println("-->twos:" + twos);

			System.out.println("ones:" + ones);
			System.out.println("twos:" + twos);
			System.out.println("notThrees:" + notThrees);

			System.out.println("----------------------------------");

		}
		return ones;
	}
}
