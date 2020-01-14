package hr.Strings;

import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i, j, k=0, count = 0;
		String str;
		int[] operations = new int[t];
		
		while (t > 0) {
			
			str = sc.next();
			count = 0;
			i = 0;
			j = str.length() - 1;
			
			while (i <= j) {

				if ((int) str.charAt(i) > (int) str.charAt(j)) {
					while ((int) str.charAt(i) != (int) str.charAt(j)) {

						str = str.substring(0, i)
								+ (char) ((int) str.charAt(i) - 1)
								+ str.substring(i + 1);
						count += 1;
					}
				}
				else {
					while ((int) str.charAt(i) != (int) str.charAt(j)) {

						str = str.substring(0, j)
								+ (char) ((int) str.charAt(j) - 1)
								+ str.substring(j + 1);
						count += 1;
					}
				}
				j = j - 1;
				i++;
			}
			operations[k] = count;
			k++;

			t--;
		}
		
		for(i=0;i<operations.length;i++){
			System.out.println(operations[i]);
		}
	}
}
