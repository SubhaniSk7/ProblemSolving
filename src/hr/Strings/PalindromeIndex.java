package hr.Strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] indexes = new int[t];
		int i, k = 0, j, flag = 0;

		while (t > 0) {
			flag = 0;
			String number = in.next();
			number=number.toLowerCase();
			i = 0;
			j = number.length() - 1;
			while (i <= j) {
				if ((int) number.charAt(i) == (int) number.charAt(j)) {
					flag = 0;
				} else {
					if ((int) number.charAt(i) == (int) number.charAt(j - 1) && (int) number.charAt(i+1) == (int) number.charAt(j - 2)) {
						flag = 1;
						indexes[k] = j;
						k++;
						break;
					}
					else if((int) number.charAt(i+1) == (int) number.charAt(j) && (int) number.charAt(i+2) == (int) number.charAt(j - 1)){
						flag = 1;
						indexes[k] = i;
						k++;
						break;
					}
					else {
						flag = 1;
						indexes[k] = i;
						k++;
						break;
					}
				}
				j = j - 1;
				i++;
			}

			if (flag == 0) {
				indexes[k] = -1;
				k++;
			}
			t--;
		}

		for (i = 0; i < indexes.length; i++) {
			System.out.println(indexes[i]);
		}
	}
}
