package com.hackerearth;

public class CustomSwapFunction {
	
	public static void main(String[] args) {	
		char[] test = "efforadgdfgdrrrsadfasfasdfasdfasfasdfasdfasdfgrgtbrthrthrtrtrtgrtgrtgtr".toCharArray();
		sort(test, 0, test.length);
		System.out.println(test);
	}
			
		private static void sort (char x[] , int off, int len){
			if(len<7){
				for(int i=off ; i< len+off;i++){
					for(int j=i;j>off && x[j-1]>x[j]; j--){
						swap(x, j, j-1);
						return;
					}
				}
			}
					  // Choose a partition element, v
			         int m = off + (len >> 1);       // Small arrays, middle element
			         if (len > 7) {
			             int l = off;
			             int n = off + len - 1;
			             if (len > 40) {        // Big arrays, pseudomedian of 9
			                 int s = len/8;
			                 l    =       med3(x,     l,           l+s,  l+2*s);
			                 m =     med3(x, m-s,     m,   m+s);
			                 n   = med3(x,   n-2*s, n-s, n);
			             }
			             m = med3(x, l, m, n); // Mid-size, med of 3
			         }
			         char v = x[m];
			         
			         // Establish Invariant: v* (<v)* (>v)* v*
			                  int a = off, b = a, c = off + len - 1, d = c;
			                  while(true) {
			                      while (b <= c && x[b] <= v) {
			                          if (x[b] == v)
			                              swap(x, a++, b);
			                          b++;
			                      }
			                      while (c >= b && x[c] >= v) {
			                          if (x[c] == v)
			                              swap(x, c, d--);
			                          c--;
			                      }
			                      if (b > c)
			                          break;
			                      swap(x, b++, c--);
			                  }
			          
			                  // Swap partition elements back to middle
			                  int s, n = off + len;
			                  s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
			                  s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);
			          
			                  // Recursively sort non-partition-elements
			                  if ((s = b-a) > 1)
			                      sort(x, off, s);
			                  if ((s = d-c) > 1)
			                      sort(x, n-s, s);
		}
		 private static void vecswap(char x[], int a, int b, int n) {
			           for (int i=0; i<n; i++, a++, b++)
			               swap(x, a, b);
		}	
		private static int med3(char x[], int a, int b, int c) {
			         return (x[a] < x[b] ?
			                 (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
			                 (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
	   } 	
		private static void swap(char x[], int a, int b) {
			         char t = x[a];
			         x[a] = x[b];
			         x[b] = t;
			     }
}
