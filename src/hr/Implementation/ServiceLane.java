package hr.Implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String subhani[]){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        int x,y,i,j,min;
        int[] result=new int[t];
        for(x=0; x< n; x++){
            width[x] = in.nextInt();
        }
        
        for(x = 0; x < t; x++){
        	i = in.nextInt();
            j = in.nextInt();
            min=Integer.MAX_VALUE;
            for(y=i;y<=j;y++){
            	if(min>width[y]){
            		min=width[y];
            	}
            }
            result[x]=min;
        }
        for(x=0;x<t;x++){
        	System.out.println(result[x]);
        }
	}
}
