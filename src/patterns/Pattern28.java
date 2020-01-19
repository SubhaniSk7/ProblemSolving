package patterns;
import java.util.Scanner;

//    A
//   AB
//  ABC
// ABCD
//ABCDE

public class Pattern28 {
    public static void main(String subhani[]) {
	System.out.println("enter capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, k;
	int j;
	for (i = 'A'; i <= n; i++) {
	    for (j = n - i; j > 0; j--) {
		System.out.print(" ");
	    }
	    for (k = 'A'; k <= i; k++) {
		System.out.print(k);
	    }
	    System.out.println();
	}
    }
}
