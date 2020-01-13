package com.bridgelabz.logical;
import com.bridgelabz.utility.Utility;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	
	public static void main(String[] args) {
		System.out.println("Enter choice:\n1 for start game \n2 for end game");
		int ch=Utility.inputNumber();
		switch(ch) {
		case 1:
			Utility.print();
			Utility.user();
			Utility.print();
			break;
		case 2:
			System.exit(0);
		}
	}
}
