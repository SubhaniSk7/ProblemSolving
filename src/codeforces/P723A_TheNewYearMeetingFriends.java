package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P723A_TheNewYearMeetingFriends {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] points = new int[3];
		for (int i = 0; i < 3; ++i)
			points[i] = Integer.parseInt(st.nextToken());
		solution(points);
	}

	public static void solution(int[] points) {
		int max = Math.max(points[0], Math.max(points[1], points[2]));
		int min = Math.min(points[0], Math.min(points[1], points[2]));
		int distance = max - min;// point is at middle point
		System.out.println(distance);
	}
}
