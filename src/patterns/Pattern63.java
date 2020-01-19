package patterns;
import java.util.Scanner;

//input:3
//   D
//  DC
// DCB
//DCBA
// DCB
//  DC
//   D

public class Pattern63 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= -n; i--) {
	    for (j = 1; j <= Math.abs(i); j++) {
		System.out.print(" ");
	    }
	    for (k = n; k >= Math.abs(i); k--) {
		System.out.print((char) (k + 65));
	    }
	    System.out.println();
	}
    }
}
