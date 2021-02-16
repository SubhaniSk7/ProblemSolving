package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P69A_YoungPhysicist {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] forces = new int[n][3];
		StringTokenizer st;
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++)
				forces[i][j] = Integer.parseInt(st.nextToken());
		}
		solution(n, forces);
	}

	public static void solution(int n, int[][] forces) {
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < n; ++i) {
			x += forces[i][0];
			y += forces[i][1];
			z += forces[i][2];
		}
		if (x == 0 && y == 0 && z == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
