package com.bridgelabz.StockMarket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StockMarket obj = new StockMarket();
		
		while(true) {
			System.out.println("1. Enter New Stock \n2. Display Stock Report \n3. Withdraw Amount From Balance \n4. Exit ");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				obj.addStock();
				break;
			case 2:
				obj.stockReport();
				break;
			case 3:
				obj.debit();
				break;
			case 4:
				System.out.println("Good Bye");
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}
