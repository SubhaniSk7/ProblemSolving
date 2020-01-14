package hr.Implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n];

		int i, jumps = 0;

		for (i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		for (i = 0; i + 2 < n;) {
			
			if ((c[i + 1] == 0 && c[i + 2] == 0) || (c[i + 1] == 1 && c[i + 2] == 0)) {
				i = i + 2;
			}
			else if (c[i + 1] == 0 && c[i + 2] == 1) {
				i = i + 1;
			}
			jumps += 1;
		}
		if(i!=n-1){
			jumps+=1;
		}
		System.out.println(jumps);
	}
}
