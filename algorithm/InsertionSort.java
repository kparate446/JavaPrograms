package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class InsertionSort {
	public static void main(String[] args) {
		int A[]= {1,12,3,4,6,45,32,37,47,7,754,12};
		int N=A.length;
		Utility.Insertion(A,N);
		for(int i=0;i<N;i++) {
			System.out.print(A[i]+" ");
		}	
	}
}
