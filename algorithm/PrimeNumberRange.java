package com.bridgelabz.algorithm;

public class PrimeNumberRange {
	public static void main(String[] args) {
		int i,j;
		for(i=0;i<=1000;i++) {
			int c=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}
		
	}
}
