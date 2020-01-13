/*
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement: Computes the prime factorization of N using brute force.
 */
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class PrimeFactors {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int N=Utility.inputNumber();
		int x=N;
		int k=Utility.PrimeFactors(x);
		System.out.println(k);
	}
}
