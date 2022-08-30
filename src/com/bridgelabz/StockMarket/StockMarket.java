package com.bridgelabz.StockMarket;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMarket {
	ArrayList<String> stockName = new ArrayList<String>();
	ArrayList<Integer> numberOfShare = new ArrayList<Integer>();
	ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
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
	

	
}
