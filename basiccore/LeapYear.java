package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		boolean leap;
		System.out.println("Enter the Year");
		year=Utility.inputNumber();
		leap=Utility.leapOrNotLeap(year);
		//System.out.println(leap);
		if(leap) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}
}
