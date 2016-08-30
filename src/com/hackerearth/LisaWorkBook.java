package com.hackerearth;

import java.util.Scanner;

public class LisaWorkBook {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int c = s.nextInt();
		int mod = s.nextInt();
		
	
		int noOfSheets= 0;
		int result = 0;
		int arr[] = new int[c];
		for(int a =0; a<c; a++){
			arr[a] = s.nextInt();
			noOfSheets+= (arr[a]/mod) + ((arr[a]% mod )>0 ? 1 :0);
		}
		
		int[][] arrayOfArray = new int[noOfSheets][mod];
		int n=0;
		int  cd=0;
		for(int b=0;b<c;b++){
			int x=0;
			int y=1;
			while(!(arr[b] +1==y) ){			
				if(x>mod-1){
					x=x%mod;			
					n++;
					if(n+1==y ){
						result++;
				//		System.out.println(y);
					}			
					arrayOfArray[n][x] = y; 
					x++;
					y++;			
					continue;
				}	
				arrayOfArray[n][x] = y; 			
				if(n+1==y){
					result++;
				//	System.out.println(y);
				}
				x++;
				y++;			
			}
			
			n++;
		
			}
		
		
		System.out.println(result);
	}
	
	

}
