package patterns;
import java.util.Scanner;

//    A
//   ABC
//  ABCDE
// ABCDEFG
//ABCDEFGHI
public class Pattern41 {
    public static void main(String subhani[]) {
	System.out.println("enter Capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, k;
	int j, z = 1;
	for (i = 'A'; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 0; k < z; k++) {
		System.out.print((char) (65 + k));
	    }
	    z += 2;
	    System.out.println();
	}
    }
}
