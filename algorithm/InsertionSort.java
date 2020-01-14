package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
public class InsertionSort {
	public static void main(String[] args) {
		String A[]= {"krunal","vishal","ram","Bhushan"};
		String B[]=Utility.insertionSort(A);
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}	
	}

}