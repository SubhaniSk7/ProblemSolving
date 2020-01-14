package hr.Sorting;
import java.util.Scanner;

public class CountingSort1_2 {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i, max = -1;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int[] count = new int[max + 1];

		for (i = 0; i < n; i++) {
			count[arr[i]] += 1;
		}
		int k=0,j=0;
		int a[]=new int[n];
		for(i=0;i<max+1;i++){
			if(count[i]==0){
				continue;
			}
			else{
				for(k=0;k<count[i];k++)
					a[j++]=i;
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}

	}
}
