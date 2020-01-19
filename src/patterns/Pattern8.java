package patterns;
import java.util.Scanner;

//E E E E E
//D D D D D 
//C C C C C
//B B B B B
//A A A A A

public class Pattern8 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Capital letter(>=A):");
	char n = sc.next().charAt(0);
	char i, j;
	for (i = n; i >= 'A'; i--) {
	    for (j = 'A'; j <= n; j++)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
