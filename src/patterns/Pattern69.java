package patterns;
import java.util.Scanner;

//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    *

public class Pattern69 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= 1; i--) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print("* ");
	    }
	    System.out.println();
	}
    }
}
