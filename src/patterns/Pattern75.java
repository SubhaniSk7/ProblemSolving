package patterns;
import java.util.Scanner;

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    *

public class Pattern75 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= -n; i--) {
	    for (j = 0; j < Math.abs(i); j++) {
		System.out.print(" ");
	    }
	    for (k = n; k >= Math.abs(i); k--) {
		System.out.print("* ");
	    }
	    System.out.println();
	}
    }
}
