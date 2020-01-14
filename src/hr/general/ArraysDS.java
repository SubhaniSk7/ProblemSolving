package hr.general;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysDS {

	public static void main(String subhani[]){
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int i;
        
        for(i=0; i< n; i++)
            a[i] = in.nextInt();
        for(i=0; i < m; i++)
            b[i] = in.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
//        for(i=0;i<a.length;i++)
//        	System.out.print(a[i]+" ");
//        System.out.println();
//        for(i=0;i<b.length;i++)
//        	System.out.print(b[i]+" ");
//        System.out.println();
        
        int counter=0;
        for(i=a[n-1];i<=b[0];i+=a[n-1]){
        	if(i%a[n-1]==0 && b[0]%i==0){
        		System.out.println(i);
        		counter++;
        	}
        }
        System.out.println(counter);
	}
}
