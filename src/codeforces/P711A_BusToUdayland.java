package codeforces;

import java.io.*;

public class P711A_BusToUdayland {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] seats = new String[n];
		for (int i = 0; i < n; ++i)
			seats[i] = br.readLine();
		solution(n, seats);
	}

	public static void solution(int n, String[] seats) {
		boolean print = false;
		for (int i = 0; i < n; ++i) {
			if (seats[i].charAt(0) == 'O' && seats[i].charAt(1) == 'O') {
				seats[i] = "++" + seats[i].substring(2);
				print = true;
				break;
			} else if (seats[i].charAt(3) == 'O' && seats[i].charAt(4) == 'O') {
				seats[i] = seats[i].substring(0, 3) + "++";
				print = true;
				break;
			}
		}
		if (print) {
			System.out.println("YES");
			for (int i = 0; i < n; ++i)
				System.out.println(seats[i]);
		} else
			System.out.println("NO");
	}
}
