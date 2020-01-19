package patterns;
import java.util.Scanner;

//EEEEEEEEE
// DDDDDDD
//  CCCCC
//   BBB
//    A

public class Pattern51 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter capital letter(>=A):");
	char n = sc.next().charAt(0);
	char i;
	int j, k, z = 2 * (n - 64) - 1;
	for (i = n; i >= 'A'; i--) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print(i);
	    }
	    z -= 2;
	    System.out.println();
	}
    }
}
