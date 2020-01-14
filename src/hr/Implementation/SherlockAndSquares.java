package hr.Implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b;
		int[] squares = new int[t];
		int sqrt,j=0;
		while (t > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			squares[j]=(int)Math.floor(Math.sqrt(b))-(int)Math.ceil(Math.sqrt(a))+1;
			j++;t--;
		}
		for(j=0;j<squares.length;j++)
			System.out.println(squares[j]);
	}
}
