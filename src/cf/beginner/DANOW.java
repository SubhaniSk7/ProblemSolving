package cf.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DANOW {

	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());

		long[] A = new long[N], B = new long[N];

		st = new StringTokenizer(br.readLine());
		int i;
		for (i = 0; i < N; i++)
			A[i] = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < N; i++)
			B[i] = Long.parseLong(st.nextToken());

		for (i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());

			printStrength(A, B, L, R);
		}

	}

	public static void printStrength(long[] a, long[] b, int L, int R) {

		long sum = 0;

		int i = L;
		for (i = L - 1; i < R; i++)
			sum += (a[i] * b[i]);

		System.out.println(sum);

	}
}
