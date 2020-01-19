package patterns;
import java.util.Scanner;

//input=3:-->
// D
// CD
// BCD
// ABCD
// BCD
// CD
// D

public class Pattern58 {

    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = n; i >= -n; i--) {
	    for (j = Math.abs(i); j <= n; j++) {
		System.out.print((char) (j + 65));
	    }
	    System.out.println();
	}
    }
}
