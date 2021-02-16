package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P581A_VasyaTheHipster {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		solution(a, b);
	}

	public static void solution(int a, int b) {
		int diff = 0, same = 0;
		if (a == b) {
			diff = a;
		} else if (a > b) {
			if (b != 0) {
				diff = b;
				a -= b;
			}
			same = a / 2;
		} else {
			if (a != 0) {
				diff = a;
				b -= a;
			}
			same = b / 2;
		}
		// or diff = min(a,b) same = max( (a - min(a,b))/2, (b - min(a,b))/2)
		System.out.println(diff + " " + same);
	}
}
