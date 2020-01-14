package hr.Sorting;

import java.util.Scanner;

public class InsertionPart2 {

	public static void insertionSortPart2(int[] ar){
		
		int i,j,temp;
		for(i=1;i<ar.length;i++){
			temp=ar[i];
			j=i-1;
			while (j >= 0 && ar[j] >= temp) {

				ar[j + 1] = ar[j];
				j--;
			}
			ar[j + 1] = temp;
			printArray(ar);
		}
		
	}
    
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	int s = in.nextInt();
    	int[] ar = new int[s];
    	for(int i=0;i<s;i++){
    		ar[i]=in.nextInt();
    	}
    	
    	insertionSortPart2(ar);
       
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
      System.out.println("");
   }
}
