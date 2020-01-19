package patterns;
import java.util.Scanner;

//GGGGGGG
// EEEEE
//  CCC
//   A

public class Pattern52 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter capital letter(>=A):");
	char n = sc.next().charAt(0);
	char i;
	int j, k, z = 2 * (n - 64) - 1;
	System.out.println(z);
	for (i = n; i >= 'A'; i--) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print((char) (z + 64));
	    }
	    z -= 2;
	    System.out.println();
	}
    }
}
