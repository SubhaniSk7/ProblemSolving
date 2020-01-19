package patterns;
import java.util.Scanner;

//*       *
// *     *
//  *   *
//   * *
//    *

public class Pattern86 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = 0; i < n; i++) {
	    for (j = 0; j < i; j++) {
		System.out.print(" ");
	    }
	    System.out.print("*");
	    for (k = 1; k < 2 * z; k++) {
		System.out.print(" ");
	    }
	    if (i != n - 1)
		System.out.print("*");
	    System.out.println();
	    z--;
	}
    }
}
