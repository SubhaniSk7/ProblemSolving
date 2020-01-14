package hr.Implementation;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String subhani[]){
		Scanner in = new Scanner(System.in);
        int n = 26,i,index;
        int h[] = new int[n];
        for(i=0; i < n; i++)
            h[i] = in.nextInt();
        
        String word = in.next();
        int max=h[(int)word.charAt(0)-97];
        for(i=0;i<word.length();i++){
        	index=(int)word.charAt(i);
        	System.out.println(index);
        	if(h[index-97]>=max){
        		max=h[index-97];
        	}
        }
        System.out.println();
        System.out.println(word.length()*max);
	}
}
