package codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P228A_IsYourHorseshoeOnTheOtherHoof {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> shoes = new HashSet<Integer>();
		for (int i = 0; i < 4; i++)
			shoes.add(Integer.parseInt(st.nextToken()));
		solution(shoes);
	}

	public static void solution(HashSet<Integer> shoes) {
		System.out.println(4 - shoes.size());
	}
}
