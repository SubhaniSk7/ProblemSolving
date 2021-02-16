package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P492A_VanyaAndCubes {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		int height = 0, cubes = 0, levelCubes = 0;
		for (int i = 1; i <= n; ++i) {
			levelCubes += i;
			cubes = cubes + levelCubes;
			if (cubes <= n)
				height++;
			else
				break;
		}
		System.out.println(height);
	}
}
