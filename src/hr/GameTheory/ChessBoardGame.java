package hr.GameTheory;

import java.util.Scanner;

public class ChessBoardGame {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		String[] winner = new String[t];
		int i = 0, x, y;

		while (t > 0) {

			x = sc.nextInt();
			y = sc.nextInt();

			if ((x%4==0) || (x%4==3) || (y%4==0)|| (y%4==3)) {
				winner[i] = "First";
			} else {
				winner[i] = "Second";
			}
			i++;
			t--;
		}
		for (i = 0; i < winner.length; i++) {
			System.out.println(winner[i]);
		}
	}
}
