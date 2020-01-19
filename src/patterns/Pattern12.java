package patterns;
import java.util.Scanner;

//1
//1 2
//1 2 3
//1 2 3 4 
//1 2 3 4 5

public class Pattern12 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = 1; i <= n; i++) {
	    for (j = 1; j <= i; j++)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
