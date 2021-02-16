package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P617A_Elephant {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		solution(x);
	}

	public static void solution(int x) {
		int steps = 0;
		while (x > 0) {
			if (x >= 5)
				x -= 5;
			else if (x >= 4)
				x -= 4;
			else if (x >= 3)
				x -= 3;
			else if (x >= 2)
				x -= 2;
			else
				x--;
			steps++;
		}
		// steps = (x+4)/5
		System.out.println(steps);
	}
}
