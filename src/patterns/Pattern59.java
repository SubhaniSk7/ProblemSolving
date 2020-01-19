package patterns;
import java.util.Scanner;

//   *
//  **
// ***
//****
// ***
//  **
//   *

public class Pattern59 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = n; i >= -n; i--) {
	    for (j = 0; j < Math.abs(i); j++) {
		System.out.print(" ");
	    }
	    for (k = n; k >= Math.abs(i); k--) {
		System.out.print("*");
	    }
	    z--;
	    System.out.println();
	}

    }
}
