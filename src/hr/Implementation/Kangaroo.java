package hr.Implementation;
import java.math.BigInteger;
import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		int sub,flag = 0;
		if ((x1 < x2 && v1 > v2) || (x1 > x2 && v1 < v2)) {

			if (x1 == x2)
				flag = 1;
			else {
				sub = Math.abs(v1 - v2);
				if (Math.abs(x1 - x2) % sub == 0)
					flag = 1;
				else
					flag = 0;
			}
			if (flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			System.out.println("NO");
		}
	}
}
