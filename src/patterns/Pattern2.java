package patterns;
import java.util.Scanner;
//Subhani

//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 

public class Pattern2 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;

	for (i = 1; i <= n; i++) {
	    for (j = 0; j < n; j++)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
