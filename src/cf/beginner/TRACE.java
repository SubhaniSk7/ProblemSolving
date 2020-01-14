package cf.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TRACE {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine()), i, j;
			int[][] arr = new int[n][n];

			for (i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (j = 0; j < n; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			traceOfSubMatrix(arr);
		}
	}

	public static void traceOfSubMatrix(int[][] arr) {

		int i, j, max = -1, t1, t2, n = arr.length;

		for (i = 0; i < n; i++) {
			t1 = 0;
			t2 = 0;
			for (j = 0; j < n - i; j++) {
				t1 += arr[i + j][j];
				t2 += arr[j][i + j];
//				System.out.println(arr[i + j][j] + "-->" + arr[j][i + j]);

				if (max < t1)
					max = t1;
				if (max < t2)
					max = t2;
			}
//			System.out.println("-------------------");
		}
		System.out.println(max);
	}
}
