package patterns;
import java.util.Scanner;

//E D C B A 
// D C B A 
//  C B A 
//   B A 
//    A

public class Pattern73 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= 1; i--) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = i; k >= 1; k--) {
		System.out.print((char) (k + 64) + " ");
	    }
	    System.out.println();
	}
    }
}
