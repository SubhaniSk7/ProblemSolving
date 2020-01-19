package patterns;
import java.util.Scanner;

//E E E E E 
// D D D D 
//  C C C 
//   B B 
//    A

public class Pattern72 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= 1; i--) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = i; k >= 1; k--) {
		System.out.print((char) (i + 64) + " ");
	    }
	    System.out.println();
	}
    }
}
