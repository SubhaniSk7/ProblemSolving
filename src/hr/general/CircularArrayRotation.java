package hr.general;
import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		int n,k,q,i;
		n=sc.nextInt();
		k=sc.nextInt();
		q=sc.nextInt();
		
		int[] array=new int[n];
		int[] indexes=new int[q];
		int[] rotated=new int[n];
		
		for(i=0;i<n;i++)
			array[i]=sc.nextInt();
		for(i=0;i<k;i++)
			rotated[i]=array[n-k+i];
		for(i=k;i<n;i++)
			rotated[i]=array[i-k];
		for(i=0;i<q;i++)
			indexes[i]=sc.nextInt();
		for(i=0;i<indexes.length;i++)
			System.out.println(rotated[indexes[i]]);
	}
}
