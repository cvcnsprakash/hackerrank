package com.hackerearth;

import java.util.Scanner;

public class DivisibleSumPair {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int length  = sca.nextInt();
		int val = sca.nextInt();
		int res = 0;
		int arr[]= new int[length];
		for(int a=0;a<length;a++){
			arr[a] = sca.nextInt();
		}
		
		for(int x=0;x<length;x++){
			for(int y=0;y<length;y++){
				if(x!=y &&((arr[x]+arr[y])%val == 0) && x<y){
					{
						res++;
					}
				}
			}
		}
		
		System.out.println(res);
		
		
		
	}

}
