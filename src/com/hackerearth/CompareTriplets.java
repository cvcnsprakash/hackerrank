package com.hackerearth;

import java.util.Scanner;

public class CompareTriplets {
	
	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int v[]= new int[6];
		for(int a=0;a<3;a++){
			v[a] = s.nextInt();
		}
		
		
		
		for(int  b=0;b<3;b++){
			v[5] = s.nextInt();
			if(v[b] > v[5] ){
				v[3]++;
				continue;
			}else if(v[b]<v[5]){
				v[4]++;
				continue;
			}
		}
		
		System.out.println(v[3] + " " + v[4] );
	}
	


}
