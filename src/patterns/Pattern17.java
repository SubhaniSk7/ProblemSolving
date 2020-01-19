package patterns;
import java.util.Scanner;

//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

public class Pattern17 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = n; i > 0; i--) {
	    for (j = 1; j <= i; j++)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
