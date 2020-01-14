package hr.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int i, j, k, differentCount;
		String[] str = new String[t];
		int[] result = new int[t];

		for (i = 0; i < t; i++)
			str[i] = sc.next();
		
		i = 0;
		while (t > 0) {
			
			int[] first = new int[26];
			int[] second = new int[26];
			differentCount = 0;
			if (str[i].length() % 2 == 0) {

				char[] c1 = str[i].substring(0, str[i].length() / 2)
						.toCharArray();
				char[] c2 = str[i].substring((str[i].length() / 2))
						.toCharArray();

				Arrays.sort(c1);
				String substr1 = String.valueOf(c1);

				Arrays.sort(c2);
				String substr2 = String.valueOf(c2);

				for (j = 0; j < substr1.length(); j++) {

					first[(int) substr1.charAt(j) - 'a']++;
					second[(int) substr2.charAt(j) - 'a']++;

				}
				for (j = 0; j < 26; j++) {

					if (first[j] > second[j] && first[j] > 0) {
						differentCount += Math.abs(first[j] - second[j]);
					}
				}

				result[i] = differentCount;
				differentCount = 0;
			} else {
				result[i] = -1;
			}
			i++;
			t--;
		}

		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}
