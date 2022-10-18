package com.bridgelabz.StockMarket;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMarket {
	ArrayList<String> stockName = new ArrayList<String>();
	ArrayList<Integer> numberOfShare = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int balance = 1000; // inital account balance

	
	public void addStock() {
		System.out.println("Enter the Stock Name : ");
		stockName.add(sc.next());
		System.out.println("Enter the number of shares : ");
		numberOfShare.add(sc.nextInt());
		System.out.println("Enter the share price : ");
		sharePrice.add(sc.nextInt());
	}
	
	public void stockReport() {
		System.out.println("****STOCK REPORT****");
		for (int i =0; i < stockName.size(); i++) {
			int total = (numberOfShare.get(i) * sharePrice.get(i));
			
			System.out.println("Stock Name =" +stockName.get(i) + "\nValue of each share =" +sharePrice.get(i) 
								+"\nTotal value of share =" +total);
		}
	}
	public void debit() {
		System.out.println("Enter the amount you want to withdraw: ");
		int withdraw = sc.nextInt();
		if (withdraw < balance) {
			balance = balance - withdraw;
			System.out.println("Debit is succesful of amount :" + withdraw);
			System.out.println("Total amount left after withdrawal= " + balance);
		} else
			System.out.println("Debit amount exceeded account balance");
	}
	

	
}
