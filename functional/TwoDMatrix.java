package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class TwoDMatrix {
	public static void main(String[] args) {
		int arr[][]=new int[10][10];
		System.out.println("Enter the Row");
		int row=Utility.inputNumber();
		System.out.println("Enter the Column");
		int column=Utility.inputNumber();
		System.out.println(row*column+"-Array Element");
		System.out.println("Enter the Number");
//		Utility.IntArray(arr,row,column);
		DoubleArray(arr,row,column);
	}
	public static int IntArray(int arr[][],int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {

				arr[i][j]=Utility.inputNumber();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return column;
	}
	public static double DoubleArray(int arr[][],int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {

				arr[i][j]=(int) Utility.inputDouble();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return column;
		
	}
}
