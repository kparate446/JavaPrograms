package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class PowerOfDemo {
	public static void main(String[] args) {
//		System.out.println("Enter the Base");
//		int base=Utility.inputNumber();
		int base=2;
		System.out.println("Enter the Exponential");
		int exp=Utility.inputNumber();
		int power=Utility.CalculatePower(exp, base);
		System.out.println("2^"+exp+"="+power);
	}
}
