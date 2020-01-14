package hr.Implementation;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i;
		int n, c, m, count = 0, wrappercount;
		int[] result=new int[t];
		for (i = 0; i < t; i++) {
			n = sc.nextInt();
			c = sc.nextInt();
			m = sc.nextInt();
			count = 0;
			wrappercount = (n / c);
			count = wrappercount;
			while (!(wrappercount < m)) {
				count = count + (wrappercount / m);
				if (wrappercount % m == 0) {
					wrappercount = wrappercount/m;
				} else {
					wrappercount = wrappercount - (wrappercount / m)*m+(wrappercount/m);
				}
//				System.out.println("wc:" + wrappercount);
			}
			result[i]=count;
//			System.out.println(count);
		}
		for(i=0;i<t;i++)
			System.out.println(result[i]);
	}
}
