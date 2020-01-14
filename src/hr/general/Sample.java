package hr.general;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int temp = k;
		String number = in.next();
		int i = 0, j = n - 1, flag = 0;

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
}
