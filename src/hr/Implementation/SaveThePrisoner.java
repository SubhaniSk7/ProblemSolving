package hr.Implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			
			int prisoner=s+m-1;
			while(prisoner >n){
				prisoner-=n;
			}
			System.out.println(prisoner);
			t--;
		}
	}
}
