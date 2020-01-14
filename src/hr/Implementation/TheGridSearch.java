package hr.Implementation;

import java.util.Scanner;

public class TheGridSearch {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i,j,k,m,columnIndex,flag;
        int[] result=new int[t];
        for(i = 0; i< t; i++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(j=0; j < R; j++){
                G[j] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(j=0; j < r; j++){
                P[j] = in.next();
            }
            
            m=0;
            flag=0;
            for(j=0;j<R;j++){
            	m=0;
            	if(G[j].contains(P[m])){
            		columnIndex=G[j].indexOf(P[m]);
                	for(k=j+1;k<R;k++){
                		m++;
                		if(G[k].substring(columnIndex).contains(P[m]) && G[k-1].substring(G[k].indexOf(P[m])).contains(P[m-1])){
                			flag=0;
                			if(m+1==r){
                				break;
                			}
                		}else{
                			flag=1;
                			break;
                		}
                	}
                	if(flag==0){
                		break;
                	}
            	}else{
            		flag=1;
            	}
            }
            if(flag==1){
            	result[i]=1;
        	}else{
        		result[i]=0;
        	}
        }
        for(i=0;i<t;i++){
        	if(result[i]==1){
        		System.out.println("NO");
        	}else{
        		System.out.println("YES");
        	}
        }
    }
}
