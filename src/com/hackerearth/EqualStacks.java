package com.hackerearth;

import java.util.Scanner;

public class EqualStacks {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		int height[] = new int[3];
		int sum[] = new int[3];
		
		int max=0;
		for(int a=0;a<3;a++){
			height[a] = s.nextInt();
			if(height[a]>max){
				max=height[a];
			}
		}
		
		int prime[][] = new int[max][3];
		
		for(int b=0;b<3;b++){
			for(int c=height[b]-1; c>-1;c--){
				prime[c][b] = s.nextInt();
				sum[b] += prime[c][b];
			}
		}
		
		int minSum = sum[0]<sum[1]? (sum[0]<sum[2] ? sum[0] : sum[2]) : (sum[1]<sum[2]? sum[1] :sum[2]);
	
		System.out.println(minSum);
		
		while(sum[0]!= sum[1] || sum[1]!=sum[2]){
			
			for(int p=0;p<3;p++){
			   int hite = height[p]-1;
			     if(sum[p] > minSum){
			    	 sum[p] -= prime[hite][p];
			    	 if(minSum>sum[p]){
			    		 minSum = sum[p];
			    	 }    	
			    	 height[p]--;
			     }			   
			}			
		}
		System.out.println(sum[0]);
		
		
		
		
		
		
		
	}
}
	

