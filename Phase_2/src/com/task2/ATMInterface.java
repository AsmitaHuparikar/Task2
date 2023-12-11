package com.task2;

import java.util.Scanner;

class ATMData
{
	int balance=100000,withdraw,deposit;
	int Pin=9758;
	Scanner sc=new Scanner(System.in);
	
	public void checkATMPin()
	{
		System.out.println(System.in);
		int enteredpin=sc.nextInt();
		System.out.println();
		if(enteredpin==Pin)
		{
			menu();
		}
		else
		{
			System.out.println("Enter a valid pin");
			checkATMPin();
		}
	}
	
	public void menu()
	{
		System.out.println("Choose options");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check Balnce");
		System.out.println("4.Exit");
		System.out.println("Choose the operation you want to perform:");
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("Enter Amount to be withdrawn:");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("Please collect your money");
				}
				else
				{
					System.out.println("Insufficient Balance");;
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter money to be deposited:");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("Your money has been successfully deposited");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("Balance:"+balance);
				System.out.println("");
				break;
				
			case 4:
				System.exit(0);
		}
	}	
}
public class ATMInterface 
{
	public static void main(String[] args) 
	{
			ATMData data=new ATMData();
			data.checkATMPin();
	}
}