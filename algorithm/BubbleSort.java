package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class BubbleSort {
	public static void main(String[] args) {
		int A[]= {1,2,3,5,6,4154,5463,533,13,46,35};
		int N=A.length;
		Utility.Bubble(A,N);
		for(int i=0;i<N-1;i++) {
			System.out.print(A[i]+" ");
		}
	}
}
