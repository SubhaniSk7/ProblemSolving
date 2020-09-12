package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P282A_Bit {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] program = new String[n];
		for (int i = 0; i < n; ++i) {
			program[i] = br.readLine();
		}
		solution(program, n);
	}

	public static void solution(String[] program, int n) {

		int i, x = 0;
		for (i = 0; i < n; ++i) {
			if (program[i].equals("++X") || program[i].equals("X++")) {
				x += 1;
			} else if (program[i].equals("--X") || program[i].equals("X--")) {
				x -= 1;
			}
		}
		System.out.println(x);
	}
}
