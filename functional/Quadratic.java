/*
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement: Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula (Note: Take a, b and c as input values)
 */
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter the A Value");
		double a=Utility.inputNumber();
		System.out.println("Enter the B Value");
		double b=Utility.inputNumber();
		System.out.println("Enter the C Value");
		double c=Utility.inputNumber();
		Utility.getRoots(a, b, c);
	}
}
