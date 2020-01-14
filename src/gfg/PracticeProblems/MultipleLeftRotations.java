package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleLeftRotations {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];

			st = new StringTokenizer(br.readLine());
			int i = 0;
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			for (i = 0; i < n; i++)
				System.out.print(arr[(i + k) % n] + " ");
			System.out.println();
		}
	}
}
