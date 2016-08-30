package com.hackerearth;

import java.util.Scanner;

public class BiggerIsGreater {
	
	public static void main(String[] args) {
	 
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		for(int  a=0;a<count;a++){
			System.out.println(getNext(s.next().toCharArray())); 	
		}
	
				
	}
	
	private static String getNext(char[] charArray){
    	int pivot = charArray.length -1;
    	//Finding Pivot
		for(int x=charArray.length-1 ;x>0;x--){
			
				if(charArray[x] <= charArray[x-1] ){
				continue;
			}else{
				pivot = x-1;
				break;
			}
		}
		
		
		
		
		char toReplace = charArray[charArray.length-1];
		int replaceIndex = charArray.length-1;
		for(int y=charArray.length-1 ;y>pivot;y--){
			if(charArray[y] <= charArray[pivot]){
				continue;
			}else{
				toReplace = charArray[y];
				replaceIndex=y;
				break;
			}			
		}
		
		if(pivot==1 && replaceIndex == charArray.length -1 && (charArray[pivot] == charArray[replaceIndex]))
		{
return "no answer";
		}

		//Replace
		char temp = charArray[pivot];
		
		charArray[pivot] = toReplace;
		charArray[replaceIndex] = temp;
		int length = charArray.length-1;
		int i = pivot+1;
		//Swap from Pivot Index+1 till End
		while ( i < length){
			char tempy = charArray[length];
			charArray[length] = charArray[i];
			charArray[i] = tempy;
			i++;
			length --;
		}
		return  String.valueOf(charArray);
		
		
		
		
	}
}
