package com.task2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String number="5";
		String guess="";
		int guessCount=0;
		int guessLimit=3;
		boolean outOfGuesses=false;
		
		while(!guess.equals(number)&& !outOfGuesses)
		{
			if(guessCount<guessLimit)
			{
				System.out.print("Enter a guess:");
				guess=sc.nextLine();
				guessCount++;
			}
			else
			{
				outOfGuesses=true;
			}
		}
		if(outOfGuesses)
		{
			System.out.println("You Lose!No more guesses");
		}
		else
		{
			System.out.println("You guessed correct number");
		}
	}
}