package com.hackerearth;

import java.util.Scanner;

public class SecurityFunction {
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num%11);
    }
}