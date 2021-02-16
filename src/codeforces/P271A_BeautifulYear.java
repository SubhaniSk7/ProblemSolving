package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P271A_BeautifulYear {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		solution(y);
	}

	public static void solution(int y) {
		boolean loop = true;
		int i = y + 1;
		while (loop) {
			int year = i;
			boolean answer = true;
			int[] freq = new int[10];
			while (i > 0) {
				freq[i % 10] += 1;
				if (freq[i % 10] > 1) {
					answer = false;
					break;
				}
				i /= 10;
			}
			if (answer) {
				System.out.println(year);
				break;
			}
			i = year + 1;
		}
	}
}
