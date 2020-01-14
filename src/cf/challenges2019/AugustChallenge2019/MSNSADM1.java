package cf.challenges2019.AugustChallenge2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MSNSADM1 {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine()), i;

			// already given sorted arrays
			int[] A = new int[n], B = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				A[i] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				B[i] = Integer.parseInt(st.nextToken());

			bestPlayer(A, B);
		}
	}

	public static void bestPlayer(int[] A, int[] B) {

		int i, j, n = A.length;
		int[] result = new int[n];

		int max = -1;
		for (i = 0; i < n; i++) {
			int score = A[i] * 20 - B[i] * 10;
			result[i] = (score < 0) ? 0 : score;
			if (result[i] > max)
				max = result[i];
		}

		System.out.println(max);
	}
}
