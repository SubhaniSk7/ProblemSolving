package patterns;
import java.util.Scanner;

//A A A A A 
//B B B B B 
//C C C C C 
//D D D D D 
//E E E E E 

public class Pattern4 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Capital letter(>=A):");
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = 'A'; j <= n; j++)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
