package com.Adhyayan.bms.app.UI;


import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

import com.Adhyayan.bms.app.service.Hdfc;
import com.Adhyayan.bms.app.service.Rbi;
import com.Adhyayan.bms.app.model.Account;

public class UiTest {
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		Rbi Bank = new Hdfc();
		 while (true) {
		
		System.out.println("Welcom To Hdfc Bank");
		System.out.println("Enter your choice");
		System.out.println("1.Create New Account");
		System.out.println("2.Display All Details");
		System.out.println("3.Deposite Money");
		System.out.println("4.Withdrawl");
		System.out.println("5.Balance Check");
		System.out.println("6.Exit");
		System.out.println("Enter Your Choice");
		Scanner sc = new Scanner(System.in);
	     int key = sc.nextInt();
	     
	    
			switch (key) {
			case 1:
				Bank.createAccount();
				break;
				
			case 2:
				Bank.displayAllDetails();
				break;
				
			case 3: 
				Bank.depositeMoney();
				break;
				
			case 4:
				Bank.withdrawal();
				break;
				
			case 5:
				Bank.balanceCheck();
				break;
				
			case 6:
				System.exit(0);
				break;

			default:
				throw new IllegalArgumentException("Unexcepted Value:-"+key);
			
			}
			
		}
	} 

}
