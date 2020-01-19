package patterns;
import java.util.Scanner;

//5 5 5 5 5 
// 4 4 4 4 
//  3 3 3 
//   2 2 
//    1 

public class Pattern70 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = n; i >= 1; i--) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print(i + " ");
	    }
	    System.out.println();
	}
    }
}
