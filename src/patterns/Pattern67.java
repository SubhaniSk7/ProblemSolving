package patterns;
import java.util.Scanner;

//    A 
//   B B 
//  C C C 
// D D D D 
//E E E E E 

public class Pattern67 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = 1; i <= n; i++) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print((char) (i + 64) + " ");
	    }
	    System.out.println();
	}
    }
}
