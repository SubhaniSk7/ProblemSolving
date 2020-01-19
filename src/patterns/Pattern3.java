package patterns;
import java.util.Scanner;

//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 

public class Pattern3 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int i, j;
	for (i = 1; i <= n; i++) {
	    for (j = 1; j <= n; j++)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
