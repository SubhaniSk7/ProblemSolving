package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P236A_BeautifulMatrix {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[5][5];
		for (int i = 0; i < 5; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; ++j)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		solution(arr);
	}

	public static void solution(int[][] arr) {
		int i = 0, j = 0, count = 0;
		boolean found = false;
		for (i = 0; i < 5; ++i) {
			for (j = 0; j < 5; ++j)
				if (arr[i][j] == 1) {
					found = true;
					break;
				}
			if (found)
				break;
		}
		if (i == 0 || i == 4)
			count += 2;
		if (i == 1 || i == 3)
			count += 1;
		if (j == 0 || j == 4)
			count += 2;
		if (j == 1 || j == 3)
			count += 1;

		// simply abs(3-i+1)+abs(3-j+1) = (3-r)+(3-c)
		System.out.println(count);
	}
}
