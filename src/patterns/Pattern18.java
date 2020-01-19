package patterns;
import java.util.Scanner;

//A A A A A
//B B B B
//C C C
//D D
//E

public class Pattern18 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = n; j >= i; j--)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
