package hr.Search;

import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i, j, k, r = 0, c = 0,flag=0;
		int m, n;
		int[][] result = new int[t][2];

		for (i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			flag=0;
			int[] flavors = new int[n];

			for (j = 0; j < n; j++) {
				flavors[j] = sc.nextInt();
			}
			for (j = 0; j < n - 1; j++) {
				c = 0;
				for (k = j + 1; k < n; k++) {
					if (flavors[j] + flavors[k] == m) {
//							System.out.println(j+"-"+k+"-"+r+":"+c);
							result[r][c] = j + 1;
							c++;
							result[r][c] = k + 1;
						r++;
						flag=1;
						break;
					}
				}
				if(flag==1){
					break;
				}
			}
		}
		for (j = 0; j < t; j++) {
			for (k = 0; k < 2; k++) {
				System.out.print(result[j][k] + " ");
			}
			System.out.println();
		}
	}
}
