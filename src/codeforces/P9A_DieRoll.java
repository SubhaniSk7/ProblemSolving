package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9A_DieRoll {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		solution(y, w);
	}

	public static void solution(int y, int w) {
		int max = Math.max(y, w);
		int choices = 6 - max + 1;
		if (choices == 0)
			System.out.println("0/1");
		else if (choices == 1 || choices == 5)
			System.out.println(choices + "/6");
		else if (6 % choices == 0)// 3,6
			System.out.println(1 + "/" + (6 / choices));
		else
			System.out.println((choices / 2) + "/" + (6 / 2));
	}
}
