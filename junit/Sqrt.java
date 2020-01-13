package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;
public class Sqrt {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num=Utility.inputNumber();
		double s=Utility.Sqrt(num);
		System.out.println(s);
	}
}
