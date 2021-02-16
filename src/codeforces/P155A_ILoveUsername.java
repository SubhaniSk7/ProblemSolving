package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P155A_ILoveUsername {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] scores = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			scores[i] = Integer.parseInt(st.nextToken());
		solution(n, scores);
	}

	public static void solution(int n, int[] scores) {
		int max = scores[0], min = scores[0], amazing = 0;
		for (int i = 1; i < n; ++i) {
			if (max < scores[i]) {
				amazing++;
				max = scores[i];
			}
			if (min > scores[i]) {
				amazing++;
				min = scores[i];
			}
		}
		System.out.println(amazing);
	}
}
