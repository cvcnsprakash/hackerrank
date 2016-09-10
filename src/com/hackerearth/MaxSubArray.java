package com.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArray {
	//Kadane's Algorithm
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int times = s.nextInt();
		
		for(int x=0;x<times;x++){
			int length = s.nextInt();
			int[] arr = new int[length];
			for(int x1 = 0; x1<length;x1++){
				arr[x1] = s.nextInt();
			}
			//Pass to method
			getContiguosOutput(arr);
		}
		
	}
	
	private static void  getContiguosOutput(int[] input){
		//Contiguos
		int maxSum =0;
		int nonC = 0;
		int maxTillNow = Integer.MIN_VALUE;
		for(int x: input){
			maxSum = Math.max(x, maxSum+x);
			maxTillNow = Math.max(maxSum,  maxTillNow);
			nonC = x>0 ? nonC+x : nonC;
		}
		
		if(nonC ==0){
			//Dere could be better way to do without sorting the Array, which itself is Memory Consuming
			Arrays.sort(input);
			if(input[input.length-1] <=0){
				nonC = input[input.length-1];
			}
		}
		
		System.out.println(maxTillNow + " " +  nonC);
		
		
		//Non Contiguos
	}


}
