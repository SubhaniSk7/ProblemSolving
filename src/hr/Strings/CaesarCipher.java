package hr.Strings;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int k = sc.nextInt();
		k = k % 26;
		int i, temp;
		String cipher = "", alpha = "";

		for (i = 0; i < n; i++) {

			if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {

				temp = (int) str.charAt(i) + k;
				if (temp > 90) {
					while (temp > 90) {
						temp = temp - 90;
					}
					alpha = "" + (char) (65 + temp - 1);
				} else {
					alpha = "" + (char) temp;
				}
				cipher = cipher + alpha;

			}
			else if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {

				temp = (int) str.charAt(i) + k;
				if (temp > 122) {
					while (temp > 122) {
						temp = temp - 122;
					}
					alpha = "" + (char) (97 + temp - 1);
				} else {
					alpha = "" + (char) temp;
				}
				cipher = cipher + alpha;
			} else {
				cipher = cipher + str.charAt(i);
			}
		}
		System.out.println(cipher);
	}
}