package hr.Implementation;

import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		String[] str = new String[t];
		String[] result = new String[t];
		
		int i, j, k, flag = 0;
		for (i = 0; i < t; i++)
			str[i] = sc.next();
		
		i = 0;
		while (t > 0) {
			for (j = str[i].length() - 1; j > 0; j--) {
				if ((int) str[i].charAt(j) > (int) str[i].charAt(j - 1))
					break;
			}
			if (j == 0) {
				result[i] = "no answer";
			} else {
				int x = (int) str[i].charAt(j - 1);
				int smallest = j;
				for (k = j + 1; k < str[i].length(); k++) {
					if ((int) str[i].charAt(k) > x
							&& (int) str[i].charAt(k) < (int) str[i]
									.charAt(smallest)) {
						smallest = k;
					}
				}
				char[] c = str[i].toCharArray();

				char first = c[j - 1];
				c[j - 1] = c[smallest];
				c[smallest] = first;

				String swapped = new String(c);
				str[i] = swapped;

				for (k = j; k < str[i].length() - 1; k++) {
					for (int y = k + 1; y < str[i].length(); y++) {
						if ((int) str[i].charAt(k) > (int) str[i].charAt(y)) {

							char[] d = str[i].toCharArray();

							char second = d[k];
							d[k] = d[y];
							d[y] = second;
							String swappedstr = new String(d);
							str[i] = swappedstr;
						}
					}
				}
				result[i] = str[i];
			}
			i++;
			t--;
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}
