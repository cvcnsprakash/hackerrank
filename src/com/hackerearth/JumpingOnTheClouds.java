package com.hackerearth;

import java.util.Scanner;

public class JumpingOnTheClouds {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int length = s.nextInt();
		int arr[] = new int[length];
		int count =0;
		for(int a=0;a<length;a++) {
			arr[a] = s.nextInt();
		}
		
		int b=0;
		while( b !=length-1){	
			
			if(b == length-2 && arr[length-2]==0){
				count++;
				System.out.println(count);
				return;
			}
			if(arr[b+2] ==1){
				b++;
			}else {
				b +=2;
			}
			count++;			
		}
		System.out.println(count);
		
		
		s.close();
		
		
	}

}
