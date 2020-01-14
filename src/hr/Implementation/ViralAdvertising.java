package hr.Implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 5, i,total=0;
		if (n == 1) {
			System.out.println(count / 2);
		} else {
			for (i = 1; i <= n; i++) {
				if (i == 1){
					count = 5;
					total=count/2;
				}
				else {
					count = (count / 2) * 3;
					total+=count/2;
					//					System.out.println("n:" + n + " :" + count);
				}
			}
			System.out.println(total);
		}
	}
}
