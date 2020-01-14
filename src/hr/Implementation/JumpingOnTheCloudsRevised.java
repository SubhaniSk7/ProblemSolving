package hr.Implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevised {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		int E = 100, i;
		if (k != n) {
			for (i = 0; i + k < n;) {

				if (c[i + k] == 0) {
					E -= 1;
//					System.out.println("if:" + E + " i:" + i);
				} else if (c[i + k] == 1) {
					E = E - 1 - 2;
//					System.out.println("else if:" + E + " i:" + i);
				}

				i = i + k;
			}
//			System.out.println("out:" + i);
			if (c[0] == 0)
				E -= 1;
			if (c[0] == 1)
				E = E - 1 - 2;
		}
		else {
			if (c[0] == 0)
				E -= 1;
			if (c[0] == 1)
				E = E - 1 - 2;
		}
		System.out.println(E);
	}
}
