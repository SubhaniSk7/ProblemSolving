package hr.Strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), count;
		String[] str = new String[n];
		String substr1 = "AA", substr2 = "BB";
		int i;

		for (i = 0; i < n; i++) {
			str[i] = in.next();
		}
		for (i = 0; i < n; i++) {
			count = 0;
			while (str[i].contains(substr1) || str[i].contains(substr2)) {

				if (str[i].contains(substr1)) {
					str[i] = str[i].replaceFirst(substr1, "A");
					count += 1;
				}
				if (str[i].contains(substr2)) {
					str[i] = str[i].replaceFirst(substr2, "B");
					count += 1;
				}
			}
			System.out.println(count);
		}
	}
}
