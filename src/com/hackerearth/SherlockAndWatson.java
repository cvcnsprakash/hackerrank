package com.hackerearth;

import java.util.Scanner;

public class SherlockAndWatson {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		
		int length = in.nextInt();
		int[] ds = new int[length];
		int offset  = in.nextInt();
		int query = in.nextInt();
		
		int x=0;

		for(int a=0; a<length;a++){
			ds[(x+ offset)% length] = in.nextInt();
			x++;
		}
		
		int interim =0;
		
		for(int b=0;b<query;b++){
		System.out.println(ds[in.nextInt()]);
		
		
		
		
		}
		
		
		
	}

}
