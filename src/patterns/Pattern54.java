package patterns;
import java.util.Scanner;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Pattern54 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = n; i >= -n; i--) {
	    for (j = n; j >= Math.abs(i); j--) {
		System.out.print("*");
	    }
	    System.out.println();
	}
    }
}
