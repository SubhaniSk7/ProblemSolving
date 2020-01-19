package patterns;
import java.util.Scanner;

//    A 
//   A B 
//  A B C 
// A B C D 
//A B C D E 

public class Pattern68 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = 1; i <= n; i++) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print((char) (k + 64) + " ");
	    }
	    System.out.println();
	}
    }
}
