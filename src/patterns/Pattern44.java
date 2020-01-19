package patterns;
import java.util.Scanner;

//    A
//   BAB
//  CBABC
// DCBABCD
//EDCBABCDE

public class Pattern44 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i;
	int j, k, z = 1, x = 1;
	for (i = 'A'; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print((char) (65 + Math.abs(k - x)));
	    }
	    x++;
	    z += 2;
	    System.out.println();
	}
    }
}
