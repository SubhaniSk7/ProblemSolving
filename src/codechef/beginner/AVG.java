package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AVG {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()),
					V = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			average(arr, N, K, V);
		}
	}

	public static void average(int[] arr, int N, int K, int V) {

		int i = 0, sum = 0;
		for (i = 0; i < N; i++)
			sum += arr[i];
		int x = (V * (N + K)) - sum;
		if (x % K == 0 && x / K > 0)
			System.out.println(x / K);
		else
			System.out.println("-1");
	}
}
