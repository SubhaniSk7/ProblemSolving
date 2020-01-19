package patterns;
import java.util.Scanner;

//    A
//   CBA
//  EDCBA
// GFEDCBA
//IHGFEDCBA

public class Pattern42 {
    public static void main(String subhani[]) {
	System.out.println("enter Capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i;
	int j, k, z = 1;
	for (i = 'A'; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = z - 1; k >= 0; k--) {
		System.out.print((char) (65 + k));
	    }
	    z += 2;
	    System.out.println();
	}
    }
}
