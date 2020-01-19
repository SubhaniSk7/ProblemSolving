package patterns;
import java.util.Scanner;

//input:3
//   D
//  CD
// BCD
//ABCD
// BCD
//  CD
//   D

public class Pattern62 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= -n; i--) {
	    for (j = 1; j <= Math.abs(i); j++) {
		System.out.print(" ");
	    }
	    for (k = Math.abs(i); k <= n; k++) {
		System.out.print((char) (k + 65));
	    }
	    System.out.println();
	}
    }
}
