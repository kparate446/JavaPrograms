/*
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement: Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y)
 */
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Distance {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double d=Utility.getDistance(x, y);
		System.out.println(d);
	}
}
