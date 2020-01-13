/*
  created by: Krunal Parate
  Date 10/01/2020
  Problem Statement: Flip Coin and print percentage of Heads and Tails
 */
package com.bridgelabz.basiccore;
import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args)
	{
		int heads = 0;
		int tails = 0;
		int counter = 1;
//		double randNum = 0.0;
		System.out.println("How many times will the coin be flipped? ");
		int n =Utility.inputNumber() ;
		while(counter <= n)
		{
			if(Math.random()< 0.5)
			{
				heads++;
			}
			else
			{
				tails++;
			}
			counter++;      
		}
		int  tail=(int) (Utility.TailCalculator(tails, n));
		int head=(int) (Utility.HeadCalculator(heads, n));
		//System.out.println();
		System.out.println("Number of Tails = " + tails);
		System.out.println("Number of Heads = " + heads);
		System.out.println(tail+" "+head);
	}
}
