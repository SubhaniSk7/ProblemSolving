package hr.Strings;

import java.util.Scanner;

public class RichieRich {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int temp=k;
		String number = in.next();
		int i = 0, j = n - 1, flag = 0;

		if (n == 1 && k == 0) {
			System.out.println(number);
		}
//		if (n == 1 && k != 0) {
//			number = "9";
//			System.out.println(number);
//		}
		if(n>=1 && k>=n){
			number="";
			for(i=0;i<n;i++)
				number+="9";
			System.out.println(number);
		}
		if (n > 1 && k == 0) {
			while (i <= j) {
				if ((int) number.charAt(i) == (int) number.charAt(j)) {
					flag = 0;
				} else {
					flag = 1;
					break;
				}
				j = j - 1;
				i++;
			}
			if (flag == 0) {
				System.out.println(number);
			} else {
				System.out.println("-1");
			}
		}
		if (n > 1 && k != 0) {
			while (k > 0 && i <= j) {
				if ((int) number.charAt(i) == (int) number.charAt(j)) {

					flag = 0;

				} else {
					number = number.substring(0, i) + "9"
							+ number.substring(i + 1);
					number = number.substring(0, j) + "9"
							+ number.substring(j + 1);
					k--;
				}
				j = j - 1;
				i++;
				if (k == 0 && i <= j) {
					if ((int) number.charAt(i) != (int) number.charAt(j)) {
						flag = 1;
					}
				}
			}

			if (flag == 1) {
				System.out.println("-1");
			} else {
				System.out.println(number);
			}
		}
		
	}
}
