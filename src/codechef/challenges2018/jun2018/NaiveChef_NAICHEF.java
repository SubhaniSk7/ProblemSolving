package codechef.challenges2018.jun2018;

import java.util.Scanner;

public class NaiveChef_NAICHEF {
	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t, n, a, b, i, max;
		t = sc.nextInt();
		int[] die;
		while (t > 0) {
			max = 0;
			n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			die = new int[n];

			for (i = 0; i < n; i++) {
				die[i] = sc.nextInt();
				if (max <= die[i])
					max = die[i];
			}

			int[] count = new int[max + 1];
			for (i = 0; i < n; i++)
				count[die[i]] += 1;

			double aProb = (double) count[a] / die.length;
			double bProb = (double) count[b] / die.length;
			double win = (aProb * bProb);
			System.out.println(win);

			t--;
		}
	}
}
