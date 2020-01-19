package patterns;
import java.util.Scanner;

//A B C D E 
// A B C D 
//  A B C 
//   A B 
//    A 

public class Pattern74 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= 1; i--) {
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
