package hr.Strings;

import java.util.Scanner;

public class GemStones {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i, j = 97,count=0,total=0;
		String[] gem = new String[n];
		char[] alpha = new char[26];

		for (i = 0; i < 26; i++) {
			alpha[i] = (char) j;
			j++;
		}
		for (i = 0; i < n; i++) {
			gem[i] = sc.next();
		}
		for (i = 0; i < 26; i++) {
			for (j = 0; j < n; j++) {
				
				if (gem[j].contains("" + alpha[i])) {
					count=1;
				}
				else{
					count=0;
					break;
				}
			}
			total+=count;
		}
		System.out.println(total);

	}
}
